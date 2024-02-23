package com.faheDevs.resumeapi.projectManagment;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Project")
public class Project {
    @Id
    private String id;
    private String name;
    private String repo;
    private String live;
    private String description;
    private List<String> stack;
}
