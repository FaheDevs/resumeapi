package com.faheDevs.resumeapi.apiManagement.profileManagement;

import com.faheDevs.resumeapi.apiManagement.commentsManagment.Comment;
import com.faheDevs.resumeapi.apiManagement.contactManagement.Contact;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "Profile")
@Data
@Builder
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
