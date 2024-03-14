package com.faheDevs.resumeapi.apiManagement.profileManagement;

import com.faheDevs.resumeapi.apiManagement.commentsManagment.Comment;
import com.faheDevs.resumeapi.apiManagement.contactManagement.Contact;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@Builder
@ToString(exclude = "id")
public class Profile {

    @Id
    private String id;
    private String name;
    private String aboutMe;

    private List<Project> projects;

    private List<Experience> experience;

    private Contact contacts;

    private List<Comment> comments;
}
