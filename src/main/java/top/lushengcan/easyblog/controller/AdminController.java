//package top.lushengcan.easyblog.controller;
//
//import com.lsc.easyblog.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.DigestUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import top.lushengcan.easyblog.model.Article;
//import top.lushengcan.easyblog.model.User;
//import top.lushengcan.easyblog.service.ArticleService;
//
//import javax.servlet.http.HttpSession;
//import java.util.Date;
//import java.util.List;
//
//
//@Controller
//public class AdminController {
//
//    /**
//     * @describe: 新版本自动注入
//     * @author: Lu Shengcan
//     * @date: 2022-1-3, 周一, 23:41
//     */
//    private final ArticleService articleService;
//    private final UserService userService;
//
//    public AdminController(ArticleService articleService, UserService userService) {
//        this.articleService = articleService;
//        this.userService = userService;
//    }
//
//    /**
//     * @describe: admin登录页面
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 20:40
//     */
//    @GetMapping("/admin/login")
//    public String login() {
//        return "admin/login";
//    }
//
//    /**
//     * @describe: admin登录请求处理
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 16:1
//     */
//    @PostMapping("/admin/login")
//    public String login(@RequestParam("username") String u_name, @RequestParam("password") String u_password,
//                        HttpSession session) {
//        User user = new User();
//        user.setUserName(u_name);
//        String md5Password = DigestUtils.md5DigestAsHex(u_password.getBytes());
//        user.setUserPassword(md5Password);
//
//        if (userService.checkUser(user)) {
//            user.setUserPassword(null);
//            session.setAttribute("user", user);
//            return "redirect:/admin/index";
//        } else {
//            return "admin/login";
//        }
//    }
//
//    /**
//     * @describe: admin首页
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 15:20
//     */
//    @GetMapping(value = {"/admin", "/admin/index"})
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("admin/index");
//        List<User> users = userService.findAllUser();
//        modelAndView.addObject("users", users);
//        return modelAndView;
//    }
//
//    /**
//     * @describe: admin文章页
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 22:59
//     */
//    @GetMapping("/admin/article")
//    public ModelAndView article() {
//        ModelAndView modelAndView = new ModelAndView("admin/article");
//        List<Article> articles = articleService.findAllArticle();
//        modelAndView.addObject("articles", articles);
//        return modelAndView;
//    }
//
//    /**
//     * @describe: admin用户页
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 23:0
//     */
//    @GetMapping("/admin/user")
//    public String user() {
//        return "redirect:/admin/index";
//    }
//
//    /**
//     * @describe: 增加文章页
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 23:18
//     */
//    @GetMapping("/admin/add_article")
//    public String addArticle() {
//        return "admin/add_article";
//    }
//
//    /**
//     * @describe: 增加文章请求处理
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 23:21
//     */
//    @PostMapping("/admin/add_article")
//    public void add_article(@RequestParam("a_title") String a_title,
//                            @RequestParam("a_content") String a_content) {
//        Article article = new Article();
//        article.setArticleTitle(a_title);
//        article.setArticleContent(a_content);
//        Date date = new Date();
//        article.setArticleCreatedTime(date);
//        article.setArticleModifiedTime(date);
//        articleService.addArticle(article);
//    }
//
//    /**
//     * @describe: 注册页面
//     * @author: Lu Shengcan
//     * @date: 2022-1-2, 周日, 21:19
//     */
//    @GetMapping("/admin/user_register")
//    public String register() {
//        return "admin/user_register";
//    }
//
//    /**
//     * @describe: 注册表单提交
//     * @author: Lu Shengcan
//     * @date: 2022-1-2, 周日, 21:20
//     */
//    @PostMapping("/admin/user_register")
//    public String register_post(@RequestParam("username") String u_name,
//                                @RequestParam("password") String u_password) {
//        // System.out.println("post HHHHHH");
//        User user = new User();
//        user.setUserName(u_name);
//        String md5Password = DigestUtils.md5DigestAsHex(u_password.getBytes());
//        // System.out.println(md5Password);
//        user.setUserPassword(md5Password);
//        userService.addUser(user);
//        return "redirect:login";
//    }
//}
