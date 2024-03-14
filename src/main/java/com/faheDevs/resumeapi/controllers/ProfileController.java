package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.apiManagement.profileManagement.ProfileService;
import com.faheDevs.resumeapi.controllers.DTOs.ProfileDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cv/resume")
@CrossOrigin(origins = "*")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    @Operation(summary = "Get profile", description = "Returns a list of all profile")
    @ApiResponse(responseCode = "200", description = "Successful operation")
    public ResponseEntity<ProfileDTO> getProfile() {
        return ResponseEntity.ok(profileService.getProfile());
    }
}

