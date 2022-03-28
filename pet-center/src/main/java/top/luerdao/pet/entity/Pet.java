package top.luerdao.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author luerdao
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Pet对象", description="")
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "键主")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "宠物姓名")
    @TableField("petName")
    private String petName;

    @ApiModelProperty(value = "宠物类型")
    @TableField("petType")
    private String petType;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "age (1.2.3)")
    private Date birthday;

    @ApiModelProperty(value = "图片")
    private String pic;

    @ApiModelProperty(value = "现在的状态 0 没有申请领养 1申请中 2被领养	")
    private Integer state;

    @ApiModelProperty(value = "主人，0，未被领养")
    private Integer uid;

    @ApiModelProperty(value = "详情")
    private String remark;

    @ApiModelProperty(value = "性格1.慢热 2.活泼 3.高冷 4.佛系	")
    private Integer character;

    @ApiModelProperty(value = "联系方式（手机 emali")
    private String contactInformation;

    @ApiModelProperty(value = "是否接种疫苗 0未接种，1接种")
    private Integer vaccine;

    @ApiModelProperty(value = "逻辑删除")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "乐观锁")
    private Integer version;


}
