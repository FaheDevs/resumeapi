package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString(exclude = "id")
public class Experience {
    @Id
    private String id;
    private String title;
    private String company;
    private String range;
    private List<String> responsibilities;
}
