package com.ruoyi.gwc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_account_opt_log")
@Table(name = "t_account_opt_log")
@Entity
@ApiModel("用户操作表")
public class AccountOptLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private Long accountId;

    private String remark;

    @Excel(name = "用户名", cellType = Excel.ColumnType.STRING, prompt = "用户名")
    private String nickname;

    @Excel(name = "操作类型", readConverterExp = "1=编辑oao,2=编辑通证")
    private Integer type;

    @Excel(name = "操作前值", cellType = Excel.ColumnType.STRING, prompt = "操作前值")
    private String sourceValue;

    @Excel(name = "操作后值", cellType = Excel.ColumnType.STRING, prompt = "操作后值")
    private String targetValue;

    @Excel(name = "变更值", cellType = Excel.ColumnType.STRING, prompt = "变更值")
    private String changeValue;

    @Excel(name = "操作人", cellType = Excel.ColumnType.STRING, prompt = "操作人")
    private String operator;

    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date createTime;

}