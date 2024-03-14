package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.controllers.DTOs.ExperienceDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExperienceRepositoryImpl implements ExperienceRepository{

    public List<Experience> getAllExperiences() {
        return ExperienceDataProvider.provideExperiences();
    }

}
