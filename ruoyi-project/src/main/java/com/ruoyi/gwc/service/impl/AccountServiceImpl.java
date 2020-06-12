package com.ruoyi.gwc.service.impl;

import com.ruoyi.gwc.dto.AccountDTO;
import com.ruoyi.gwc.dto.LoginDTO;
import com.ruoyi.gwc.dto.PasswordDTO;
import com.ruoyi.gwc.dto.RegisterDTO;
import com.ruoyi.gwc.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public AccountDTO register(RegisterDTO registerDTO) {
        return null;
    }

    @Override
    public AccountDTO login(LoginDTO loginDTO) {
        return null;
    }

    @Override
    public List<AccountDTO> getInvites(Long accountId) {
        return null;
    }

    @Override
    public Boolean updatePassword(PasswordDTO passwordDTO) {
        return null;
    }

    @Override
    public List<AccountDTO> getAllAccounts() {
        return null;
    }

    @Override
    public Boolean resetPassword(String accountId) {
        return null;
    }
}
