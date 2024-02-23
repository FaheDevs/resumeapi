package com.faheDevs.resumeapi.experienceManagement;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Experience")
@Data
public class Experience {
    @Id
    private String id;
    private String title;
    private String company;
    private String range;
    private List<String> responsibilities;
}
