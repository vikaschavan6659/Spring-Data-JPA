package com.vikas.spring.data.jpa.Service;

import com.vikas.spring.data.jpa.Model.Profiles;
import com.vikas.spring.data.jpa.Reopsitory.ProfilesRepo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfileService {

    private ProfilesRepo profilesRepo;

    public ProfileService ( ProfilesRepo profilesRepo){
        this.profilesRepo= profilesRepo;

    }

    public void addMultipleProfile() {

        List<Profiles> profilesList=new ArrayList<>();

        Profiles profiles=new Profiles();
        profiles.setUserId(1);
        profiles.setName("vikas chavan");
        profiles.setContactNo("7083809252");
        profiles.setEmail("vikas.chavan@sumasoft.net");
        profiles.setAddress("Pune");
        profilesList.add(profiles);

        Profiles profiles1=new Profiles();
        profiles1.setUserId(2);
        profiles1.setName("Aarya soman");
        profiles1.setContactNo("9405030090");
        profiles1.setEmail("aarya.soman@sumasoft.net");
        profiles1.setAddress("Pune");
        profilesList.add(profiles1);

        Profiles profiles2=new Profiles();
        profiles2.setUserId(3);
        profiles2.setName("Pritam ");
        profiles2.setContactNo("8529637410");
        profiles2.setEmail("pritam@gmail.com");
        profiles2.setAddress("Pune");
        profilesList.add(profiles2);

        Profiles profiles3=new Profiles();
        profiles3.setUserId(4);
        profiles3.setName("suvarna");
        profiles3.setContactNo("1234567890");
        profiles3.setEmail("suvarna@gmail.com");
        profiles3.setAddress("Pune");
        profilesList.add(profiles3);

        profilesRepo.saveAll(profilesList);

    }

    public void getProfile(int userId) {
        Iterable<Profiles> profiles = profilesRepo.findAllById(Collections.singleton(userId));
        for (Profiles profile : profiles) {
            System.out.println("Profile found with ID " + profile.getUserId() + ":");
            System.out.println("Name: " + profile.getName());
            System.out.println("Contact No: " + profile.getContactNo());
            System.out.println("Email: " + profile.getEmail());
            System.out.println("Address: " + profile.getAddress());
        }
    }
}
