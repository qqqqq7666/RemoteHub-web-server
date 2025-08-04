package kr.co.remote_hub.controller;

import kr.co.remote_hub.service.SignalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/signals")
public class SignalController {
    private final SignalService signalService;
}
