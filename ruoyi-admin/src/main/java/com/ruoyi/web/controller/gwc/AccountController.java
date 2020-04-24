package com.ruoyi.web.controller.gwc;

import com.ruoyi.gwc.dto.AccountDTO;
import com.ruoyi.gwc.dto.LoginDTO;
import com.ruoyi.gwc.dto.RegisterDTO;
import com.ruoyi.gwc.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "AccountController", tags = "用户接口")
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public ResponseEntity<AccountDTO> register(@ApiParam(name = "registerDTO", value = "注册对象") @RequestBody RegisterDTO registerDTO){
        accountService.register(registerDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public ResponseEntity<Void> login(@ApiParam(name = "loginDTO", value = "用户登录对象") @RequestBody LoginDTO loginDTO){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/password")
    @ApiOperation("修改密码")
    public ResponseEntity<Void> resetPassword(@ApiParam(name = "accountId", value = "修改密码对象")@RequestParam("accountId") String accountId){
        accountService.resetPassword(accountId);
        return ResponseEntity.ok().build();
    }

}
