package kr.co.remote_hub.entity;

import jakarta.persistence.*;
import kr.co.remote_hub.dto.DeviceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deviceName;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public DeviceDto toDto() {
        return DeviceDto.builder()
                .deviceName(deviceName)
                .user(user)
                .build();
    }
}