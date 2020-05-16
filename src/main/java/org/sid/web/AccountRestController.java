package org.sid.web;


import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/users")
	public AppUser register(@RequestBody RegisterForm data) {
		String username=data.getUsername();
		String prenom=data.getPrenom();
		String nom=data.getNom();
		int datenaiss=data.getDatenaiss();
		String lieunaiss=data.getLieunaiss();
		String tel=data.getTel();

		AppUser user=accountService.findUserByUsername(username);
		if(user!=null) 			throw new RuntimeException("Already Exists!");
		String password=data.getPassword(); String repassword=data.getRepassword();
		if(!password.equals(repassword))
			throw new RuntimeException("You must confirm your password");
		
		AppUser appUser=new AppUser();
		appUser.setUsername(username);
		appUser.setPrenom(prenom);
		appUser.setNom(nom);
		appUser.setDatenaiss(datenaiss);
		appUser.setLieunaiss(lieunaiss);
		appUser.setTel(tel);
		appUser.setPassword(password);
		 accountService.saveUser(appUser);
		 accountService.addRoleToUse(username, "USER");
		 
		 return appUser;
		
	}
}
