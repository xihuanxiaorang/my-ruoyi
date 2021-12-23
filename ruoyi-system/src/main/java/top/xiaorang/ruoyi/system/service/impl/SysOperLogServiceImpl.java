package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysOperLogMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysOperLog;
import top.xiaorang.ruoyi.system.service.SysOperLogService;


@Service("sysOperLogService")
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements SysOperLogService {

}