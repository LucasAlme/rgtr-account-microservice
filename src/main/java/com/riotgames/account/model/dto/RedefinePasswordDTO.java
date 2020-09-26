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
public class RedefinePasswordDTO implements Serializable{
	
	private static final long serialVersionUID = 8506848531388714195L;
	private String username;
	private String password;
	private String email;
	private String dateBirth;
}
