package com.ruoyi.gwc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@TableName("t_account")
@Table(name = "t_account")
@ApiModel("用户表")
public class Account {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("是否可用")
    private Boolean activated;

    @ApiModelProperty("用户头像")
    private String imgUrl;

    @ApiModelProperty("注册时间")
    private Date registerDate;

    @ApiModelProperty("邀请码")
    private String inviteCode;

    @ApiModelProperty("推荐人")
    private Long recommendId;
}
