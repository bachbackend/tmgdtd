package com.example.service.serviceImpl;

import com.example.jpa.repository.LoginRepository;
import com.example.jpa.repository.PersonRepository;
import com.example.jpa.repository.TransactionHistoryRepository;
import com.example.jpa.repository.UpdateHistoryRepository;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
    private final LoginRepository loginRepository;
    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;

    }
    public boolean existsByUserName(String userName) {
        return loginRepository.existsByUserName(userName);
    }

}
