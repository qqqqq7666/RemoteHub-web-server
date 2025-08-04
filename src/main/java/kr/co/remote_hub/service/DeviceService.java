package kr.co.remote_hub.service;

import kr.co.remote_hub.dto.DeviceDto;
import kr.co.remote_hub.entity.Device;
import kr.co.remote_hub.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private DeviceRepository deviceRepository;

//    public double saveDevice(DeviceDto deviceDto) {
//        return deviceRepository.save(deviceDto.toEntity());
//    }
//
//    public List<DeviceDto> getDeviceListByUserId(String userId) {
//        return deviceRepository.findAllByUserId(userId).stream()
//                .map(Device::toDto)
//                .toList();
//    }
}
