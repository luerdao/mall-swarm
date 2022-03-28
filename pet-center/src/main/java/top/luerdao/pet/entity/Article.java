package top.luerdao.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "用户ID")
    private Integer uid;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "点击量")
    private Integer hitsNumber;

    @ApiModelProperty(value = "回复量")
    private Integer replyNumber;

    @ApiModelProperty(value = "点赞量")
    private Integer likesNumber;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更改时间")
    private Date gmtModified;


}
