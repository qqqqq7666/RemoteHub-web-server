package kr.co.remote_hub.service;

import kr.co.remote_hub.dto.UserDto;
import kr.co.remote_hub.entity.User;
import kr.co.remote_hub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public UserDto.Response registerUser(String id) {
        User user = User.builder()
                .id(id)
                .password(passwordEncoder.encode("1234"))
                .build();
        return userRepository.save(user).toResponse("사용자 등록 완료");
    }

    @Transactional
    public UserDto.Response changePassword(Principal principal, String password) {
        User user = userRepository.findById(principal.getName()).orElseThrow(() -> new RuntimeException("user not found error"));
        user.setPassword(passwordEncoder.encode(password));

        return user.toResponse("비밀번호 변경 완료");
    }

}
