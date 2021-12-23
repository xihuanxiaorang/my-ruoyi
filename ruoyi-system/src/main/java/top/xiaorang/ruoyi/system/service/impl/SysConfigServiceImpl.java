package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysConfigMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysConfig;
import top.xiaorang.ruoyi.system.service.SysConfigService;


@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

}