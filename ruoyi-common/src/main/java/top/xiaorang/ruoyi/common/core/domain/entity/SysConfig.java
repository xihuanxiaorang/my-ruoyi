package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 参数配置表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 参数主键
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Integer configId;
	/**
	 * 参数名称
	 */
	private String configName;
	/**
	 * 参数键名
	 */
	private String configKey;
	/**
	 * 参数键值
	 */
	private String configValue;
	/**
	 * 系统内置（Y是 N否）
	 */
	private String configType;
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
