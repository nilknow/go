package tech.poorguy.go.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import tech.poorguy.go.common.BaseController;
import tech.poorguy.go.entity.Article;
import tech.poorguy.go.service.IArticleService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController<Article,IArticleService> {
    private final IArticleService articleService;
    public ArticleController(IArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation("add article title and  content")
    @PostMapping("/addArticle")
    public void addArticle(@RequestBody Article article) {
        articleService.save(article);
    }
}

