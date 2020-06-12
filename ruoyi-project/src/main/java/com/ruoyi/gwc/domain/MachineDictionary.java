package com.ruoyi.gwc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.gwc.domain.enumerate.MachineType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@TableName("t_machine_dictionary")
@Table(name = "t_machine_dictionary")
@Entity
@ApiModel("矿机字典")
public class MachineDictionary {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String name;

    @ApiModelProperty("有效时间")
    private Integer days;

    @ApiModelProperty("产出")
    private Integer output;

    @ApiModelProperty("价格")
    private Double price;

    @ApiModelProperty("算力")
    private Integer computePower;

    @ApiModelProperty("矿机类型")
    private MachineType type;
}
