//package top.lushengcan.easyblog.interceptor;
//
//import com.lsc.easyblog.model.User;
//import org.springframework.lang.Nullable;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @describe: 登录拦截器
// * @author: Lu Shengcan
// * @date: 2022-1-1, 周六, 15:41
// */
//public class LoginInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws Exception {
//        // System.out.println("this is "+request.getRequestURL());
//        User user = (User) request.getSession().getAttribute("user");
//        // System.out.println("*** preHandle 2 ***");
//
//        if (user == null) {
//            // System.out.println("**** user == null ***");
//            response.sendRedirect("/admin/login");
//            return false;
//        }
//        // System.out.println("user.u_name: " + user.getU_name());
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request,
//                           HttpServletResponse response,
//                           Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//        // System.out.println("*** postHandle ***");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request,
//                                HttpServletResponse response,
//                                Object handler, @Nullable Exception ex) throws Exception {
//        // System.out.println("*** afterCompletion ***");
//
//    }
//}
