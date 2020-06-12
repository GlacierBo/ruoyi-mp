package com.ruoyi.gwc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_account_tree")
@Table(name = "t_account_tree")
@Entity
@ApiModel("会员树表")
public class AccountTree implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("会员ID")
    private Long accountId;

    @ApiModelProperty("parentId")
    private Long pId;

    @ApiModelProperty("层级")
    private Integer level;

    @TableField(exist = false)
    @ApiModelProperty("矿机数量")
    private Integer machineCount;
}