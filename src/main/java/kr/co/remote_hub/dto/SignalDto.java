package kr.co.remote_hub.dto;

import kr.co.remote_hub.entity.Device;
import kr.co.remote_hub.entity.Signal;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignalDto {
    private Long signal;
    private Device device;

    public Signal toEntity() {
        return Signal.builder()
                .signal(signal)
                .device(device)
                .build();
    }
}
