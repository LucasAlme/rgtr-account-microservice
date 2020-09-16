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
public class LoginAccountDTO implements Serializable {

	private static final long serialVersionUID = -2937664764435424520L;
	private String username;
	private String password;
}
