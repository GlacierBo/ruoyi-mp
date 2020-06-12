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

@Data
@TableName("t_data_dictionary")
@Table(name = "t_data_dictionary")
@Entity
@ApiModel("数据字典")
public class DataDictionary {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("名称")
    private String configName;

    @ApiModelProperty("编码")
    private String configKey;

    @ApiModelProperty("值")
    private String configValue;

    @ApiModelProperty("是否启用")
    private Boolean activated;

    @ApiModelProperty("备注")
    private String remark;
}
