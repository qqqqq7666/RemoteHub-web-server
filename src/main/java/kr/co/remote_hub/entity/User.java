package kr.co.remote_hub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import kr.co.remote_hub.dto.UserDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private String id;
    @Column(nullable = false)
    private String password;

    @Builder
    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserDto.Response toResponse(String message) {
        return UserDto.Response.builder()
                .id(id)
                .message(message)
                .build();
    }

    public String getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
