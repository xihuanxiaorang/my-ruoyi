package top.xiaorang.ruoyi.common.core.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务调度日志表
 * 
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
@Data
public class SysJobLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 任务日志ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Long jobLogId;
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
	 * 日志信息
	 */
	private String jobMessage;
	/**
	 * 执行状态（0正常 1失败）
	 */
	private String status;
	/**
	 * 异常信息
	 */
	private String exceptionInfo;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
