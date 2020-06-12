package com.ruoyi.gwc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("修改密码对象")
public class PasswordDTO {

    @ApiModelProperty("用户ID")
    private String accountId;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("新密码")
    private String newPassword;
}
