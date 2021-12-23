package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysRoleMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysRole;
import top.xiaorang.ruoyi.system.service.SysRoleService;


@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}