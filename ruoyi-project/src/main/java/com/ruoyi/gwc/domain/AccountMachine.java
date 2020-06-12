package com.ruoyi.gwc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@TableName("t_account_machine")
@Table(name = "t_account_machine")
@Entity
@ApiModel("用户矿机")
public class AccountMachine {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private Integer needOutPut;

    private Integer days;

    @ApiModelProperty("剩余")
    private Integer surplus;

    private Date startDate;

    private Date endDate;

    private Boolean activated;
}
