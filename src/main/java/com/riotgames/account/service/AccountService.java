package com.riotgames.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riotgames.account.model.Account;
import com.riotgames.account.model.dto.CreateAccountDTO;
import com.riotgames.account.model.dto.LoginAccountDTO;
import com.riotgames.account.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository repository;

	public Account createAccount(CreateAccountDTO dto) {
		Account account = new Account();
		account.setEmail(dto.getEmail());
		account.setDateBirth(dto.getDateBirth());
		account.setPassword(dto.getPassword());
		account.setUsername(dto.getUsername());
		account.setIsAdEmail(dto.getIsAdEmail());
		account.setIsTerms(dto.getIsTerms());
		return repository.save(account);
	}

	public Account loginAccount(LoginAccountDTO dto) throws Exception {

		Account account = new Account();
		account.setUsername(dto.getUsername());
		account.setPassword(dto.getPassword());

		if (account.getUsername().equals(dto.getUsername()) && account.getPassword().equals(dto.getPassword())) {
			return account;

		} else {
			return null;
		}

	}
}