package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.controllers.DTOs.ExperienceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository experienceRepository;



    public List<ExperienceDTO> getAllExperiences() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences.stream()
                .map(MapperMethods::mapToExperienceDTO)
                .collect(Collectors.toList());
    }

    public Experience getExperienceById(String id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Experience not found with id: " + id));
    }

    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }
    public void saveAllExperiences(List<Experience> experiences) {
        experienceRepository.saveAll(experiences);
    }

    public void deleteAllProjects() {
        experienceRepository.deleteAll();
    }

}
