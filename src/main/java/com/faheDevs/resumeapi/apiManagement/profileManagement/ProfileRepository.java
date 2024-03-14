package com.faheDevs.resumeapi.apiManagement.profileManagement;

import io.swagger.v3.oas.annotations.Hidden;

@Hidden
public interface ProfileRepository  {

    Profile getProfile();
}
