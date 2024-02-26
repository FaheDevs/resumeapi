package com.faheDevs.resumeapi.apiManagement.profileManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<Profile> getProfile(){
        return profileRepository.findAll();
    }
}
