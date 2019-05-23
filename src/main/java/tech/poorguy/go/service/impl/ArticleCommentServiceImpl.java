package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.ArticleComment;
import tech.poorguy.go.mapper.ArticleCommentMapper;
import tech.poorguy.go.service.IArticleCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@Service
public class ArticleCommentServiceImpl extends ServiceImpl<ArticleCommentMapper, ArticleComment> implements IArticleCommentService {

}
