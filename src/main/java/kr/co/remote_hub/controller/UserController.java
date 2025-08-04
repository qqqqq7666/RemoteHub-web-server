package kr.co.remote_hub.controller;

import kr.co.remote_hub.dto.UserDto;
import kr.co.remote_hub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto.Response> registerUser(@RequestBody String userId) {
        return ResponseEntity.created(URI.create("register complete location"))
                .body(userService.registerUser(userId));
    }

    @PatchMapping
    public ResponseEntity<UserDto.Response> changePassword(Principal principal, @RequestBody String password) {
        return ResponseEntity.status(200)
                .location(URI.create("password change complete location"))
                .body(userService.changePassword(principal, password));
    }

    @GetMapping("/test")
    public ResponseEntity<String> testAPI() {
        return ResponseEntity.ok("just for test");
    }
}
