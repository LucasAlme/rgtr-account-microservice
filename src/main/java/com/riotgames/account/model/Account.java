package com.riotgames.account.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.riotgames.account.service.Region;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "TbAccount")
@Getter
@Setter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Account implements Serializable {

	private static final long serialVersionUID = -8279494489844835835L;

	@Column(name = "DsEmail", unique = true)
	private String email;

	@Column(name = "DateBirth")
	private String dateBirth;

	@Id
	@Column(name = "Username", unique = true)
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "IsTerms")
	private Boolean isTerms;

	@Column(name = "IsAdEmail")
	private Boolean isAdEmail;

	@Column(name = "DsPlayerName", unique = true)
	private String playerName;
	
	@Column(name = "Region")
	private Region region;

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

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
