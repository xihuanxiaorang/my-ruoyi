package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 通知公告表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysNotice implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 公告ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Integer noticeId;
	/**
	 * 公告标题
	 */
	private String noticeTitle;
	/**
	 * 公告类型（1通知 2公告）
	 */
	private String noticeType;
	/**
	 * 公告内容
	 */
	private String noticeContent;
	/**
	 * 公告状态（0正常 1关闭）
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
