package com.faheDevs.resumeapi.controllers.DTOs;

import java.util.List;

public record ExperienceDTO(
        String title,
        String company,
        String range,
        List<String> responsibilities
) {}
