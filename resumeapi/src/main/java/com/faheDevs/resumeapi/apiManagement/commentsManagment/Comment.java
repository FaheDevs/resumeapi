package com.faheDevs.resumeapi.apiManagement.commentsManagment;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Comment")
@Data
public class Comment {
    @Id
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Message is required")
    @Size(max = 400, message = "Message must not exceed 400 characters")
    private String message;
}
