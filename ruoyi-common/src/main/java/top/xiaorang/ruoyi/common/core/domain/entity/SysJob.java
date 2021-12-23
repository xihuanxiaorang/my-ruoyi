package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务调度表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysJob implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 任务ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Long jobId;
	/**
	 * 任务名称
	 */
	private String jobName;
	/**
	 * 任务组名
	 */
	private String jobGroup;
	/**
	 * 调用目标字符串
	 */
	private String invokeTarget;
	/**
	 * cron执行表达式
	 */
	private String cronExpression;
	/**
	 * 计划执行错误策略（1立即执行 2执行一次 3放弃执行）
	 */
	private String misfirePolicy;
	/**
	 * 是否并发执行（0允许 1禁止）
	 */
	private String concurrent;
	/**
	 * 状态（0正常 1暂停）
	 */
	private String status;
	/**
	 * 创建者
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 备注信息
	 */
	private String remark;

}
