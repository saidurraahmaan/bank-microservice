package com.s4r.accounts.service.impl;

import com.s4r.accounts.dto.CustomerDto;
import com.s4r.accounts.service.IAccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Override
    public void createAccount(CustomerDto customerDto) {

    }

    @Override
    public CustomerDto fetchAccount(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateAccount(CustomerDto customerDto) {
        return false;
    }

    @Override
    public boolean deleteAccount(String mobileNumber) {
        return false;
    }
}
