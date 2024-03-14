package com.faheDevs.resumeapi.apiManagement.projectManagment;

import java.util.Arrays;
import java.util.List;

public class ProjectDataProvider {

    public static List<Project> provideProjects() {
        var microblogAMU = Project.builder()
                .id("project 1")
                .name("MICROBLOGAMU")
                .description("Application de microblogging inspirée de Twitter")
                .stack(Arrays.asList("JavaFx", "Java Networking", "regex", "MVC-Design Patterns"))
                .build();

        var weatherApp = Project.builder()
                .id("project 2")
                .name("WeatherApp")
                .description("Application de prévision météorologique utilisant Open Weather Map API")
                .stack(Arrays.asList("JavaFx", "ApiConsuming", "MVC-Design Patterns"))
                .build();
        return List.of(microblogAMU, weatherApp);
    }
}
