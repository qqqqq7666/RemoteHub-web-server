package kr.co.remote_hub.service;

import kr.co.remote_hub.dto.SignalDto;
import kr.co.remote_hub.entity.Signal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import kr.co.remote_hub.repository.SignalRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SignalService {
    private final SignalRepository signalRepository;

    public Signal saveSignal(SignalDto signalDto) {
        return signalRepository.save(signalDto.toEntity());
    }
}
