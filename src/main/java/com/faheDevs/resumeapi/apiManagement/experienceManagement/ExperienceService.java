package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.controllers.DTOs.ExperienceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepositoryImpl experienceRepositoryImpl;

    public List<ExperienceDTO> getAllExperiences() {
        List<Experience> experiences = experienceRepositoryImpl.getAllExperiences();
        return experiences.stream()
                .map(MapperMethods::mapToExperienceDTO)
                .collect(Collectors.toList());
    }
}
