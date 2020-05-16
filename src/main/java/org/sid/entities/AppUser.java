package org.sid.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.Id;

@Entity

public class AppUser {
	@Id @GeneratedValue
	private Long  Id;
	@Column(unique=true)
	private String username;
	
	private String prenom;
	private String nom;

	private int datenaiss;
	private String lieunaiss;
	private String tel;
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<AppRole> roles=new ArrayList<>();

	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(int datenaiss) {
		this.datenaiss = datenaiss;
	}

	public String getLieunaiss() {
		return lieunaiss;
	}

	public void setLieunaiss(String lieunaiss) {
		this.lieunaiss = lieunaiss;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	@JsonSetter
	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	
	


	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(Long id, String username, String prenom, String nom ,int datenaiss, String lieunaiss,  String tel,
			String password, Collection<AppRole> roles) {
		super();
		Id = id;
		this.username = username;
		this.prenom = prenom;
		this.nom = nom;
		this.datenaiss = datenaiss;
		this.lieunaiss = lieunaiss;
		this.tel = tel;
		this.password = password;
		this.roles = roles;
	}

	

	

	
}
