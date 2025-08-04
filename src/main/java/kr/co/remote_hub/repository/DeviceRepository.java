package kr.co.remote_hub.repository;

import kr.co.remote_hub.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    List<Device> findAllByUserId(String userId);
}
