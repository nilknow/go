package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.ArticleContent;
import tech.poorguy.go.mapper.ArticleContentMapper;
import tech.poorguy.go.service.IArticleContentService;
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
public class ArticleContentServiceImpl extends ServiceImpl<ArticleContentMapper, ArticleContent> implements IArticleContentService {

}
