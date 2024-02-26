package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository experienceRepository;



    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    public Experience getExperienceById(String id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Experience not found with id: " + id));
    }

    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

}
