package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysNoticeMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysNotice;
import top.xiaorang.ruoyi.system.service.SysNoticeService;


@Service("sysNoticeService")
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService {

}