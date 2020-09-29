package com.riotgames.account.model.dto;

import java.io.Serializable;

import com.riotgames.account.service.Region;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateAccountDTO implements Serializable {

	private static final long serialVersionUID = 5510469323940355313L;

	private String email;
	private String dateBirth;
	private String username;
	private String password;
	private Region region;
	private Boolean isTerms;
	private Boolean isAdEmail;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Boolean getIsTerms() {
		return isTerms;
	}
	public void setIsTerms(Boolean isTerms) {
		this.isTerms = isTerms;
	}
	public Boolean getIsAdEmail() {
		return isAdEmail;
	}
	public void setIsAdEmail(Boolean isAdEmail) {
		this.isAdEmail = isAdEmail;
	}
	

}
