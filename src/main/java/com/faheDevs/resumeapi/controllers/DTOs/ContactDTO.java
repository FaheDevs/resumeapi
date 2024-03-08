package com.faheDevs.resumeapi.controllers.DTOs;

public record ContactDTO(
        String email,
        String phone,
        String gitHub,
        String linkedIn,
        String twitter
) {}
