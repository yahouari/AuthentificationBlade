package org.sid;


import org.sid.dao.TaskRepository;
import org.sid.entities.AppRole;
import org.sid.entities.AppUser;
import org.sid.entities.Task;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class AuthentitationApplication implements CommandLineRunner {
	@Autowired
	private  TaskRepository taskRepository;
	
	@Autowired 
	private AccountService  accountService;
	
 	public static void main(String[] args) {
		SpringApplication.run(AuthentitationApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE() { return new BCryptPasswordEncoder();}
	
	@Override
	public void run(String... arg0) throws Exception {
		accountService.saveUser(new AppUser(null,"yassine@mail.com","elhouri","yassin",1980,"Rabat","+212671990829","123",null));

		accountService.saveUser(new AppUser(null,"user@mail.com","nizar","mehdi",1999,"Rabat","+212671990829","1234",null));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"USER"));
		
		accountService.addRoleToUse("yassine@mail.com","ADMIN");
		accountService.addRoleToUse("user@mail.com","USER");




		taskRepository.save(new Task (null,"T1"));
		taskRepository.save(new Task (null,"T2"));


	}

}
