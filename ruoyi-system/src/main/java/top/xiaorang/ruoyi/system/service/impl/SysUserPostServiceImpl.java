package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysUserPostMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysUserPost;
import top.xiaorang.ruoyi.system.service.SysUserPostService;


@Service("sysUserPostService")
public class SysUserPostServiceImpl extends ServiceImpl<SysUserPostMapper, SysUserPost> implements SysUserPostService {

}