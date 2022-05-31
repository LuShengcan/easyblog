//package top.lushengcan.easyblog.controller;
//
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.servlet.ModelAndView;
//import top.lushengcan.easyblog.service.ArticleService;
//
//
//@Controller
//public class IndexController {
//
//    private final ArticleService articleService;
//
//    public IndexController(ArticleService articleService) {
//        this.articleService = articleService;
//    }
//
//    /**
//     * @describe: 首页访问
//     * @author: Lu Shengcan
//     * @date: 2022-1-6, 周四, 20:35
//     */
//    @GetMapping(value = {"/", "/home"})
//    public ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView("home");
//
//        Page<com.lsc.easyblog.model.Article> articles = articleService.getPage(0, 4);
//
//        modelAndView.addObject("articles", articles);
//
//        return modelAndView;
//    }
//
//    /**
//     * @describe: 请求页
//     * @author: Lu Shengcan
//     * @date: 2022-1-6, 周四, 15:56
//     */
//    @GetMapping(value = {"/page/{pageNum}"})
//    public ModelAndView getPage(@PathVariable("pageNum") int pageNum) {
//        ModelAndView modelAndView = new ModelAndView("home");
//        Page<com.lsc.easyblog.model.Article> articles = articleService.getPage(pageNum, 8);
//        System.out.println(articles);
//        modelAndView.addObject("articles", articles);
//
//        return modelAndView;
//    }
//
//    /**
//     * @describe: 文章详情页
//     * @author: Lu Shengcan
//     * @date: 2022-1-6, 周四, 21:45
//     */
//    @GetMapping("/detail/{articleId}")
//    public ModelAndView detail(@PathVariable("articleId") Long articleId) {
//        ModelAndView modelAndView = new ModelAndView("detail");
//        com.lsc.easyblog.model.Article null_article = new com.lsc.easyblog.model.Article();
//        com.lsc.easyblog.model.Article article = articleService.findArticleById(articleId).orElse(null_article);
//        modelAndView.addObject("article", article);
//        return modelAndView;
//    }
//
//    /**
//     * @describe: 文章归档页
//     * @author: Lu Shengcan
//     * @date: 2022/2/1, 周二, 20:59
//     */
//    @GetMapping("/archive")
//    public ModelAndView archive() {
//        ModelAndView modelAndView = new ModelAndView("archive");
//        return modelAndView;
//    }
//
//}
