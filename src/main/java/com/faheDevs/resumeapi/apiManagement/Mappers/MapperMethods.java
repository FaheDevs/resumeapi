package com.faheDevs.resumeapi.apiManagement.Mappers;

import com.faheDevs.resumeapi.apiManagement.contactManagement.Contact;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import com.faheDevs.resumeapi.controllers.DTOs.ContactDTO;
import com.faheDevs.resumeapi.controllers.DTOs.ExperienceDTO;
import com.faheDevs.resumeapi.controllers.DTOs.ProfileDTO;
import com.faheDevs.resumeapi.controllers.DTOs.ProjectDTO;

import java.util.List;
import java.util.stream.Collectors;

public class MapperMethods {

    public static ContactDTO mapToContactDTO(Contact contact) {
        return new ContactDTO(
                contact.getEmail(),
                contact.getPhone(),
                contact.getGitHub(),
                contact.getLinkedIn(),
                contact.getTwitter());
    }

    public static ExperienceDTO mapToExperienceDTO(Experience experience) {
        return new ExperienceDTO(
                experience.getTitle(),
                experience.getCompany(),
                experience.getRange(),
                experience.getResponsibilities());
    }

    public static ProjectDTO mapToProjectDTO(Project project) {
        return new ProjectDTO(
                project.getName(),
                project.getRepo(),
                project.getLive(),
                project.getDescription(),
                project.getStack());
    }

    public static ProfileDTO mapToProfileDTO(Profile profile) {
        List<ProjectDTO> projectDTOs = profile.getProjects() != null ?
                profile.getProjects().stream().map(MapperMethods::mapToProjectDTO).collect(Collectors.toList()) : null;
        List<ExperienceDTO> experienceDTOs = profile.getExperience() != null ?
                profile.getExperience().stream().map(MapperMethods::mapToExperienceDTO).collect(Collectors.toList()) : null;
        ContactDTO contactDTO = profile.getContacts() != null ?
                mapToContactDTO(profile.getContacts()) : null;

        return new ProfileDTO(
                profile.getName(),
                profile.getAboutMe(),
                projectDTOs,
                experienceDTOs,
                contactDTO);
    }
}
