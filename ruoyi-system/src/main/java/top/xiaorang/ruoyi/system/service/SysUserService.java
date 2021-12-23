package top.xiaorang.ruoyi.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.xiaorang.ruoyi.common.core.domain.entity.SysUser;

/**
 * 用户信息表
 *
 * @author xiaorang
 * @email 15019474951@163.com
 * @date 2021-12-23 11:59:44
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getUserById(Long userId);
}

