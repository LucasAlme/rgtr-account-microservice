package com.riotgames.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riotgames.account.model.Account;
import com.riotgames.account.model.dto.CreateAccountDTO;
import com.riotgames.account.model.dto.DefineAccountDTO;
import com.riotgames.account.model.dto.LoginAccountDTO;
import com.riotgames.account.model.dto.RedefinePasswordDTO;
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

	public Account loginAccount(LoginAccountDTO loginAccountDTO) {

		Account account = new Account();
		account.setUsername(loginAccountDTO.getUsername());
		account.setPassword(loginAccountDTO.getPassword());

		Account findByUsername = repository.findByUsername(account.getUsername());
		if (findByUsername != null) {
			if (account.getUsername().equals(findByUsername.getUsername())
					&& account.getPassword().equals(findByUsername.getPassword())) {
				return account;

			}
		}
		return null;

	}

	public Account defineAccount(DefineAccountDTO defineAccountDTO) {
		Account account = new Account();
		account.setUsername(defineAccountDTO.getUsername());

		Account accountUpdate = repository.findByUsername(account.getUsername());
		if (accountUpdate != null) {
			accountUpdate.setPlayerName(defineAccountDTO.getPlayerName());
			return repository.save(accountUpdate);
		}
		return null;

	}

	public Account redefinePassword(RedefinePasswordDTO redefinePasswordDTO) {
		Account account = new Account();
		account.setUsername(redefinePasswordDTO.getUsername());
		account.setEmail(redefinePasswordDTO.getEmail());
		account.setDateBirth(redefinePasswordDTO.getDateBirth());
		
		Account accountUpdate = repository.findByUsername(account.getUsername());
		
		if (accountUpdate != null) {
			if (accountUpdate.getEmail().equalsIgnoreCase(account.getEmail()) && accountUpdate.getDateBirth().equals(account.getDateBirth())) {
				//Manda email com codigo
				accountUpdate.setPassword(redefinePasswordDTO.getPassword());
				return repository.save(accountUpdate);
			}
			
		}
		return null;
	}
}