package top.xiaorang.ruoyi.system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiaorang.ruoyi.system.service.SysUserService;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void testDeleteSysUserById() {
        sysUserService.removeById(2);
    }
}
