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
public class ArticleComment extends BaseEntity {

private static final long serialVersionUID=1L;

    private Long articleId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String content;

    private Integer upCount;

    private Integer downCount;


}
