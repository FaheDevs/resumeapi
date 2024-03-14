package com.faheDevs.resumeapi.apiManagement.contactManagement;

import io.swagger.v3.oas.annotations.Hidden;

@Hidden
public interface ContactRepository {
    Contact getContact();
}
