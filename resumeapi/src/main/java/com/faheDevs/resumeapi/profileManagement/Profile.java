package com.faheDevs.resumeapi.profileManagement;

import com.faheDevs.resumeapi.commentsManagment.Comment;
import com.faheDevs.resumeapi.contactManagement.Contact;
import com.faheDevs.resumeapi.experienceManagement.Experience;
import com.faheDevs.resumeapi.projectManagment.Project;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collation = "Profile")
@Data
public class Profile {
    
    @Id
    private String id;
    private String name;
    private String aboutMe;
    
    @DBRef
    private List<Project> projects;

    @DBRef
    private List<Experience> experience;

    @DBRef
    private Contact contacts;

    @DBRef
    private List<Comment> comments;
}
