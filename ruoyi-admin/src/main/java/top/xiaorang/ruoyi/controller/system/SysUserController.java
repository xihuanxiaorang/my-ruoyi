package top.xiaorang.ruoyi.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xiaorang.ruoyi.common.core.controller.BaseController;
import top.xiaorang.ruoyi.common.core.domain.entity.SysUser;
import top.xiaorang.ruoyi.common.core.page.TableDataInfo;
import top.xiaorang.ruoyi.system.service.SysUserService;

import java.util.List;

@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping("/list")
    public TableDataInfo list() {
        startPage();
        List<SysUser> sysUsers = sysUserService.list(null);
        return getDataTable(sysUsers);
    }
}
