package tech.poorguy.go.entity;

import tech.poorguy.go.common.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

private static final long serialVersionUID=1L;

    private String name;

    private String password;

    /**
     * 来自的国家
     */
    private String state;

    private Integer activity;

    private Double asset;

    private String description;

    private Integer achievement;

    private Date createTime;

    private Date activeTime;

    private String phone;

    private String email;


}
