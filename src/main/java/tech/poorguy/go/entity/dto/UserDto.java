package tech.poorguy.go.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author poorguy.tech
 * @Date 2019/5/19 20:39
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String name;
    private String password;
}
