package de.unibayreuth.se.taskboard.api.dtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

//TODO: Add DTO for users.
//DONE: Added DTO for users. Changed record to class for consistency with TaskDto

@Data
public class UserDto {
    @Nullable
    private final UUID id;
    @Nullable
    private final LocalDateTime createdAt;
    @NotNull
    @NotBlank
    private final String name;
}
