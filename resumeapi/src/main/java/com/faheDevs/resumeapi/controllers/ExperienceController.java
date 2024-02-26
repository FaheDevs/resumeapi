package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getAllExperiences() {
        return ResponseEntity.ok(experienceService.getAllExperiences());
    }

    @PostMapping
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience) {
        Experience createdExperience = experienceService.createExperience(experience);
        return new ResponseEntity<>(createdExperience, HttpStatus.CREATED);
    }

    // Add endpoints for updating and deleting experiences as needed
}
