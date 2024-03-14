package com.faheDevs.resumeapi.apiManagement.contactManagement;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString(exclude = "id")
public class Contact {
        @Id
        private String id;

        @Email(message = "Email should be valid")
        private String email;
        private String phone;

        private String gitHub;
        private String linkedIn;
        private String twitter;
}
