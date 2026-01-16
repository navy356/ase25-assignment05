package de.unibayreuth.se.taskboard.business.domain;

import jakarta.annotation.Nullable;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

/**
 * Domain class that stores the task metadata.
 */
@Data
public class Task implements Serializable {
        @Nullable
        private UUID id; // null when task is not persisted yet
        @NonNull
        private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("UTC")); // set on task creation
        @NonNull
        private LocalDateTime updatedAt = createdAt; // set on task updates
        @NonNull
        private String title;
        @NonNull
        private String description;
        @NonNull
        private TaskStatus status = TaskStatus.TODO;
        @Nullable
        private UUID assigneeId; // null when no user is assigned yet
}
