//package top.lushengcan.easyblog.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import top.lushengcan.easyblog.interceptor.LoginInterceptor;
//
///**
// * @describe: 拦截器配置
// * @author: Lu Shengcan
// * @date: 2022-1-1, 周六, 15:00
// */
//@Configuration
//public class LoginConfig implements WebMvcConfigurer {
//
//    /**
//     * @describe: 增加拦截器
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 20:8
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // System.out.println("Config 1");
//        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
//        // System.out.println("Config 2");
//        registration.addPathPatterns(
//                "/admin",
//                "/admin/**");
//        // System.out.println("Config 3");
//        registration.excludePathPatterns(
//                "/admin/login",
//                "/admin/user_register",
//                "/admin/test"
//                );
//        // System.out.println("Config 4");
//
//    }
//
//}
