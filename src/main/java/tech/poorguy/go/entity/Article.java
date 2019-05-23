package tech.poorguy.go.entity;

import tech.poorguy.go.common.BaseEntity;
import java.time.LocalDateTime;
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
public class Article extends BaseEntity {

private static final long serialVersionUID=1L;

    private Long content;

    private String title;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 点赞数
     */
    private Integer upCount;

    /**
     * 鄙视数
     */
    private Integer downCount;

    private Long author;

    /**
     * 阅读数
     */
    private Integer readCount;


}
