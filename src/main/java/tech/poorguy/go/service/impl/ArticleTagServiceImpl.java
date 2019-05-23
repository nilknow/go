package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.ArticleTag;
import tech.poorguy.go.mapper.ArticleTagMapper;
import tech.poorguy.go.service.IArticleTagService;
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
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements IArticleTagService {

}
