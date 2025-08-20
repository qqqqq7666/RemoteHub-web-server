package kr.co.remote_hub.entity;

import jakarta.persistence.*;
import kr.co.remote_hub.dto.DeviceDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
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

    @Builder
    public Device(Long id, String deviceName, User user) {
        this.id = id;
        this.deviceName = deviceName;
        this.user = user;
    }
}