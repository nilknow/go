package tech.poorguy.go.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

/**
 * @Author poorguy.tech
 * @Date 2019/5/19 19:17
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
@Data
public class BaseEntity {
    @Id
    private Long id;
}
