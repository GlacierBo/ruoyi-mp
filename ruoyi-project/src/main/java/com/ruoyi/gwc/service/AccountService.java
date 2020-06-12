package com.ruoyi.gwc.service;

import com.ruoyi.gwc.dto.AccountDTO;
import com.ruoyi.gwc.dto.LoginDTO;
import com.ruoyi.gwc.dto.PasswordDTO;
import com.ruoyi.gwc.dto.RegisterDTO;

import java.util.List;

/**
 * 会员管理
 */
public interface AccountService {

    /**
     * 注册
     * @param registerDTO
     * @return
     */
    AccountDTO register(RegisterDTO registerDTO);

    /**
     * 登录
     * @param loginDTO
     * @return
     */
    AccountDTO login(LoginDTO loginDTO);

    /**
     * 根据用户ID获取受邀人列表
     * @return
     */
    List<AccountDTO> getInvites(Long accountId);

    /**
     * 修改密码
     * @param passwordDTO
     * @return
     */
    Boolean updatePassword(PasswordDTO passwordDTO);

    /**
     * 获取所有用户信息
     * @return
     */
    List<AccountDTO> getAllAccounts();

    /**
     * 重置用户密码
     * @param accountId
     * @return
     */
    Boolean resetPassword(String accountId);

}
