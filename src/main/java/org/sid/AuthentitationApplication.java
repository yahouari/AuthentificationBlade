package org.sid;


import org.sid.entities.AppRole;
import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class AuthentitationApplication implements CommandLineRunner {

	
	@Autowired 
	private AccountService  accountService;
	
 	public static void main(String[] args) {
		SpringApplication.run(AuthentitationApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE() { return new BCryptPasswordEncoder();}
	
	@Override
	public void run(String... arg0) throws Exception {
	/*	accountService.saveUser(new AppUser(null,"rim.ben@gmail.com","rim","benboukhourse",1999,"Rabat","+212671990829","abcd123",null));
/*
		accountService.saveUser(new AppUser(null,"user@mail.com","nizar","mehdi",1999,"Rabat","+212671990829","1234",null));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"USER"));
		accountService.addRoleToUse("user@mail.com","USER");
accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.addRoleToUse("rim.ben@gmail.com","ADMIN");*/
		






	}

}
