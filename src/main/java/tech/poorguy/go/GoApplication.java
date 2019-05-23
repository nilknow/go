package tech.poorguy.go;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("tech.poorguy.go.mapper")
@EnableSwagger2
public class GoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoApplication.class, args);
    }

}
