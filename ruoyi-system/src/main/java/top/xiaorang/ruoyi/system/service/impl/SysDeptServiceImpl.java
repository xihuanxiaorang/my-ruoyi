package top.xiaorang.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.xiaorang.ruoyi.system.mapper.SysDeptMapper;
import top.xiaorang.ruoyi.common.core.domain.entity.SysDept;
import top.xiaorang.ruoyi.system.service.SysDeptService;


@Service("sysDeptService")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

}