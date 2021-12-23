package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysPostMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysPost;
import top.xiaorang.ruoyi.system.service.SysPostService;


@Service("sysPostService")
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost> implements SysPostService {

}