package com.faheDevs.resumeapi.apiManagement.projectManagment;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Project")
public class Project {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String repo;
    private String live;
    private String description;
    private List<String> stack;
}
