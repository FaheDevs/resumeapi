package com.faheDevs.resumeapi.apiManagement.contactManagement;

public class ContactDataProvider {

        public static Contact provideContact() {
            return Contact.builder()
                    .id("contact 1")
                    .email("zidanifahd@gmail.com")
                    .phone("0695204657")
                    .gitHub("https://github.com/FaheDevs")
                    .linkedIn("@Fahed imed zidani")
                    .build();
        }

}
