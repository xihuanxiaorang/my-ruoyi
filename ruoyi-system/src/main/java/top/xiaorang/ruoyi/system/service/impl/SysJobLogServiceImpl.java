package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysJobLogMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysJobLog;
import top.xiaorang.ruoyi.system.service.SysJobLogService;


@Service("sysJobLogService")
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements SysJobLogService {

}