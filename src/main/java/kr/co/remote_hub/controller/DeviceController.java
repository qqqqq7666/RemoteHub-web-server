package kr.co.remote_hub.controller;

import kr.co.remote_hub.dto.DeviceDto;
import kr.co.remote_hub.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/devices")
public class DeviceController {
    private final DeviceService deviceService;

//    @PostMapping
//    public ResponseEntity<DeviceDto> registerDevice(Principal principal, DeviceDto deviceDto) {
//        deviceService.
//    }
}
