package kr.co.remote_hub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Signal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long signal;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;
}