package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户和角色关联表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Long userId;
	/**
	 * 角色ID
	 */
	private Long roleId;

}
