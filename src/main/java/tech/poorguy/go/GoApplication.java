package tech.poorguy.go;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("tech.poorguy.go.mapper")
public class GoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoApplication.class, args);
    }

}
