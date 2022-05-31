//package top.lushengcan.easyblog.service.impl;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//import top.lushengcan.easyblog.Repository.ArticleRepository;
//import top.lushengcan.easyblog.model.Article;
//import top.lushengcan.easyblog.service.ArticleService;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ArticleServiceImpl implements ArticleService {
//
//    private final ArticleRepository articleRepository;
//
//    public ArticleServiceImpl(ArticleRepository articleRepository) {
//        this.articleRepository = articleRepository;
//    }
//
//    @Override
//    public void addArticle(Article article){
//
//        articleRepository.save(article);
//    }
//
//    @Override
//    public List<Article> findAllArticle() {
//
//        return articleRepository.findAll();
//    }
//
//    @Override
//    public Optional<Article> findArticleById(Long id){
//
//        return articleRepository.findById(id);
//    }
//
//    /**
//     * @describe: 获取页
//     * @author: Lu Shengcan
//     * @date: 2022-1-5, 周三, 22:22
//     */
//    @Override
//    public Page<Article> getPage(int pageNum, int pageSize){
//        Sort sort = Sort.by(Sort.Direction.DESC, "articleModifiedTime");
//        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
//        Page<Article> page = articleRepository.findAll(pageable);
//        return page;
//    }
//
//}
