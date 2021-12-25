package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 岗位信息表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysPost implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 岗位ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Long postId;
	/**
	 * 岗位编码
	 */
	private String postCode;
	/**
	 * 岗位名称
	 */
	private String postName;
	/**
	 * 显示顺序
	 */
	private Integer postSort;
	/**
	 * 状态（0正常 1停用）
	 */
	private String status;
	/**
	 * 创建者
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	/**
	 * 备注
	 */
	private String remark;

}
