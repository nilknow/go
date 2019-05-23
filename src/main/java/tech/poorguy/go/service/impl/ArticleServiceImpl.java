package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.Article;
import tech.poorguy.go.mapper.ArticleMapper;
import tech.poorguy.go.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
