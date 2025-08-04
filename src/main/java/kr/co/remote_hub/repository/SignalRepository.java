package kr.co.remote_hub.repository;

import kr.co.remote_hub.entity.Signal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignalRepository extends JpaRepository<Signal, Long> {
}
