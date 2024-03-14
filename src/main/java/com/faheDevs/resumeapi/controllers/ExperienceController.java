package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.ExperienceService;
import com.faheDevs.resumeapi.controllers.DTOs.ExperienceDTO;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv/experience")
@Tag(name = "Experience", description = "The Experience API, manage work experiences")
public class ExperienceController {

    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    @Operation(summary = "Get all experiences", description = "Returns a list of all work experiences")
    @ApiResponse(responseCode = "200", description = "Successful operation")
    public ResponseEntity<List<ExperienceDTO>> getAllExperiences() {
        return ResponseEntity.ok(experienceService.getAllExperiences());
    }

}
