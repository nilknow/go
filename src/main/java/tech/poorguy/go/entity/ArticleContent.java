package tech.poorguy.go.entity;

import tech.poorguy.go.common.BaseEntity;
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
public class ArticleContent extends BaseEntity {

private static final long serialVersionUID=1L;

    private String content;


}
