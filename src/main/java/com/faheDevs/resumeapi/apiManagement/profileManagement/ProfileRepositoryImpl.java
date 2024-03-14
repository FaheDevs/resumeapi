package com.faheDevs.resumeapi.apiManagement.profileManagement;

import com.faheDevs.resumeapi.apiManagement.contactManagement.ContactDataProvider;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.ExperienceDataProvider;
import com.faheDevs.resumeapi.apiManagement.projectManagment.ProjectDataProvider;
import org.springframework.stereotype.Component;

@Component
public class ProfileRepositoryImpl implements ProfileRepository{

    @Override
    public Profile getProfile() {
        return Profile.builder()
                .name("Fahed ZIDANI")
                .aboutMe("Ingénieur en génie logiciel. Étudiant alternant Master 2 Ingénierie du développement logiciel.")
                .projects(ProjectDataProvider.provideProjects())
                .experience(ExperienceDataProvider.provideExperiences())
                .contacts(ContactDataProvider.provideContact())
                .build();
    }
}
