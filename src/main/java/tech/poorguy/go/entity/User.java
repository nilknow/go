package tech.poorguy.go.entity;

import tech.poorguy.go.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author poorguy
 * @since 2019-05-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;

    private String country;

    private Integer activity;

    private Double asset;

    private String description;

    private Integer achievement;

    private Date createTime;

    private Date activeTime;


}
