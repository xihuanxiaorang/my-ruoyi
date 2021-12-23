package top.xiaorang.ruoyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.xiaorang.ruoyi.system.mapper")
public class MyRuoyiApplication {
  public static void main(String[] args) {
    SpringApplication.run(MyRuoyiApplication.class, args);
  }
}
