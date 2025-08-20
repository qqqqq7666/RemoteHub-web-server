package kr.co.remote_hub.controller;

import kr.co.remote_hub.dto.SignalDto;
import kr.co.remote_hub.service.SignalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/signals")
public class SignalController {
    private final SignalService signalService;

    @PostMapping
    public ResponseEntity<SignalDto> saveSignal(@RequestBody SignalDto signalDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .location(URI.create("http://localhost:8080"))
                .body(signalService.saveSignal(signalDto));
    }
}
