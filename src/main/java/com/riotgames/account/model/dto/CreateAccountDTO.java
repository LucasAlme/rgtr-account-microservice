package com.riotgames.account.model.dto;

import java.io.Serializable;

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
	private Boolean isTerms;
	private Boolean isAdEmail;

}
