package com.faheDevs.resumeapi.controllers;

import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.apiManagement.profileManagement.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resume")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public ResponseEntity<Profile> getProfile() {
        return ResponseEntity.ok(profileService.getProfile().get(0));
    }
}

