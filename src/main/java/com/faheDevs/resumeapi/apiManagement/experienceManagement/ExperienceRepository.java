package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@Hidden
public interface ExperienceRepository {

    List<Experience> getAllExperiences();
}
