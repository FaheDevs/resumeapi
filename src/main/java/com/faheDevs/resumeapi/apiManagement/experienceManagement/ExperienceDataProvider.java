package com.faheDevs.resumeapi.apiManagement.experienceManagement;

import java.util.Arrays;
import java.util.List;

public class ExperienceDataProvider {

    public static List<Experience> provideExperiences() {
        var javaDevExperience = Experience.builder()
                .id("experience 1")
                .title("INGENIEUR LOGICIEL JAVA")
                .company("MONACO TELECOM")
                .range("ALTERNANCE Master 2")
                .responsibilities(Arrays.asList("Concevoir, déployer et entretenir une solution IT complète", "Collaboration sur l'amélioration des composants React", "Prioriser la compréhension des besoins des utilisateurs"))
                .build();

        var fullStackDevExperience = Experience.builder()
                .id("experience 2")
                .title("INGENIEUR FULL STACK JAVA/REACTJS")
                .company("RIVIERA INTEGRATION SOLUTIONS FACTORY")
                .range("Avril 2023 - Août 2023")
                .responsibilities(Arrays.asList("Conception d'une extension Google Chrome", "Mise en place d'un processus d'automatisation", "Gestion de la migration des API"))
                .build();

        var javaDeveloper = Experience.builder()
                .id("experience 3")
                .title("DÉVELOPPEUR JAVA")
                .company("UNIDEES ALGERDZ")
                .range("Mars 2022 - Août 2022")
                .responsibilities(Arrays.asList("Conception et développement de plateforme de E-learning", "Participation dans les phases d'analyse, conception et développement"))
                .build();

        return List.of(javaDevExperience, fullStackDevExperience, javaDeveloper);
    }
}
