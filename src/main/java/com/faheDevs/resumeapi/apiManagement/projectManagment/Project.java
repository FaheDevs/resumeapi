package com.faheDevs.resumeapi.apiManagement.projectManagment;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Project")
@Data
@Builder
@ToString(exclude = "id")
public class Project {
    @Id
    private String id;
    private String name;
    private String repo;
    private String live;
    private String description;
    private List<String> stack;
}
