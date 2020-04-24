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
@TableName("t_machine_output_log")
@Table(name = "t_machine_output_log")
@Entity
@ApiModel("返还日志")
public class MachineOutPutLog {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("需产出")
    private Integer needOutPut;

    @ApiModelProperty("产出")
    private Integer outPut;

    @ApiModelProperty("需要天数")
    private Integer needDays;

    @ApiModelProperty("天数")
    private Integer days;

    @ApiModelProperty("开始时间")
    private Date startDate;

    @ApiModelProperty("结束时间")
    private Date endDate;

    @ApiModelProperty("是否返还结束")
    private Boolean activated;
}
