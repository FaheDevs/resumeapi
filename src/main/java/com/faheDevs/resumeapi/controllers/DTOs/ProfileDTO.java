package com.faheDevs.resumeapi.controllers.DTOs;

import java.util.List;
public record ProfileDTO(
        String name,
        String aboutMe,
        List<ProjectDTO> projects,
        List<ExperienceDTO> experience,
        ContactDTO contacts
) {}