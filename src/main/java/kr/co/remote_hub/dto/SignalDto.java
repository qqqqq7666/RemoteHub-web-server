package kr.co.remote_hub.dto;

import kr.co.remote_hub.entity.Device;
import kr.co.remote_hub.entity.Signal;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class SignalDto {
    private Long signal;
    private Long deviceId;
    private String signalName;

    public Signal toEntity() {
        return Signal.builder()
                .signal(signal)
                .build();
    }
}
