package com.riotgames.account.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
