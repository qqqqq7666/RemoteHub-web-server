package kr.co.remote_hub.entity;

import jakarta.persistence.*;
import kr.co.remote_hub.dto.SignalDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "signals")
public class Signal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String signalName;
    @Column(nullable = false, name = "signal_code")
    private Long signal;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    public SignalDto toDto() {
        return SignalDto.builder()
                .signal(signal)
                .build();
    }

    @Builder
    public Signal(Long id, String signalName, Long signal, Device device) {
        this.id = id;
        this.signalName = signalName;
        this.signal = signal;
        this.device = device;
    }
}