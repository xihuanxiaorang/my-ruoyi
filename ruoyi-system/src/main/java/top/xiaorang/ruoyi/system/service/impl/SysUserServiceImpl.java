package top.xiaorang.ruoyi.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.xiaorang.ruoyi.common.core.domain.entity.SysUser;
import top.xiaorang.ruoyi.system.mapper.SysUserMapper;
import top.xiaorang.ruoyi.system.service.SysUserService;


@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    private final SysUserMapper sysUserMapper;

    public SysUserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }


    @Override
    public SysUser getUserById(Long userId) {
        return sysUserMapper.selectUserById(userId);
    }
}