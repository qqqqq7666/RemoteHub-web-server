package kr.co.remote_hub.dto;

import kr.co.remote_hub.entity.Device;
import kr.co.remote_hub.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeviceDto {
    private String deviceName;
    private User user;

    public Device toEntity() {
        return Device.builder()
                .deviceName(deviceName)
                .user(user)
                .build();
    }
}
