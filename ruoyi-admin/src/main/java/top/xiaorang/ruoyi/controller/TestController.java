package top.xiaorang.ruoyi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.xiaorang.ruoyi.common.core.domain.entity.SysUser;
import top.xiaorang.ruoyi.system.service.SysUserService;

@RestController
@RequestMapping("/test")
public class TestController {
    private final SysUserService sysUserService;

    public TestController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping
    public SysUser test(@RequestParam Long userId) {
        return sysUserService.getUserById(userId);
    }
}
