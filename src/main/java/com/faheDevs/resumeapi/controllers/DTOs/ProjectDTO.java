package com.faheDevs.resumeapi.controllers.DTOs;

import java.util.List;

public record ProjectDTO(
        String name,
        String repo,
        String live,
        String description,
        List<String> stack
) {}

