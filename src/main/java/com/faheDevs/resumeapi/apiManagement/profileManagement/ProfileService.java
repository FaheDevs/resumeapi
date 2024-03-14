package com.faheDevs.resumeapi.apiManagement.profileManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import com.faheDevs.resumeapi.controllers.DTOs.ProfileDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepositoryImpl profileRepositoryImpl;


    public ProfileDTO getProfile() {
        Profile profile = profileRepositoryImpl.getProfile();
        return MapperMethods.mapToProfileDTO(profile);
    }
}
