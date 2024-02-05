package com.vikas.spring.data.jpa;

import com.vikas.spring.data.jpa.Model.Profiles;
import com.vikas.spring.data.jpa.Reopsitory.ProfilesRepo;
import com.vikas.spring.data.jpa.Service.ProfileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);
		ProfilesRepo service=context.getBean(ProfilesRepo.class);
		System.out.println("inside the Spring run methode");
		ProfileService profileService=new ProfileService(service);
//		profileService.addMultipleProfile();
//		profileService.getProfile(1);

//		profileService.getNameByFirstLeater("Pune");
//		profileService.getProfilesStartingWithLetter("vikas");

//		profileService.getNameLikdeAndAddress("A","Pune");


//        profileService.getSalary(55000.00);

//		profileService.getAllData();

		Profiles profiles=new Profiles();
		profiles.setUserId(9);
		profiles.setName("AshokIt");
		profiles.setContactNo("7083809252");
		profiles.setEmail("Ashok.IT@gmail.com");
		profiles.setAddress("Pune");
		profiles.setSalary(5550000.00);

		profileService.insertProfile(profiles);

		// we can preform crud operation  get , add , update , delete
		context.close();
	}

}
