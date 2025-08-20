package kr.co.remote_hub.service;

import kr.co.remote_hub.dto.SignalDto;
import kr.co.remote_hub.entity.Device;
import kr.co.remote_hub.entity.Signal;
import kr.co.remote_hub.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import kr.co.remote_hub.repository.SignalRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SignalService {
    private final SignalRepository signalRepository;
    private final DeviceRepository deviceRepository;

    public SignalDto saveSignal(SignalDto signalDto) {
        log.info("signalDto : {}", signalDto.toString());
        Device device = deviceRepository.findById(signalDto.getDeviceId()).orElseThrow();
        Signal signal = Signal.builder()
                .signalName(signalDto.getSignalName())
                .signal(signalDto.getSignal())
                .device(device)
                .build();
        return signalRepository.save(signal).toDto();
    }
}
