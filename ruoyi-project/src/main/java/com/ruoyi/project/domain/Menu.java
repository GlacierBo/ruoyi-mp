package com.ruoyi.project.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@TableName("t_menu")
@Table(name = "t_menu")
@Getter
@Setter
@ToString
@Accessors(chain = true)
@ApiModel("菜单")
public class Menu extends BaseEntity {

    @Id
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("地址")
    private String path;

    @ApiModelProperty("是否显示")
    private Boolean isShow;
}
