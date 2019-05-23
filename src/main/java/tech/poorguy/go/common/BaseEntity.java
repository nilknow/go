package tech.poorguy.go.common;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @Author poorguy.tech
 * @Date 2019/5/19 19:17
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
public class BaseEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
}
