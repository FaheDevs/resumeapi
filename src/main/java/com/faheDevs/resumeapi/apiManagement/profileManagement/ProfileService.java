package com.faheDevs.resumeapi.apiManagement.profileManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import com.faheDevs.resumeapi.controllers.DTOs.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public void save(Profile profile){
        profileRepository.save(profile);
    }
    public void deleteById(String id ){
        profileRepository.deleteById(id);
    }


    public List<ProfileDTO> getProfile() {
        List<Profile> profiles = profileRepository.findAll();
        return profiles.stream()
                .map(MapperMethods::mapToProfileDTO)
                .collect(Collectors.toList());
    }

    public void saveAllProfiles(List<Profile> profiles) {
        profileRepository.saveAll(profiles);
    }

    public void deleteAllProfiles() {
        profileRepository.deleteAll();
    }
}
