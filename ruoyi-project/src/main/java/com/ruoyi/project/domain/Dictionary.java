package com.ruoyi.project.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@TableName("t_dictionary")
@Table(name = "t_dictionary")
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("字典表")
public class Dictionary extends BaseEntity {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("字典组")
    private String groupType;

    @ApiModelProperty("字典键")
    private String code;

    @ApiModelProperty("字典值")
    private String value;

    @ApiModelProperty("字典类型")
    private String type;

}
