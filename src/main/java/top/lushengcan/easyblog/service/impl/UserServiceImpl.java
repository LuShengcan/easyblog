//package top.lushengcan.easyblog.service.impl;
//
//import com.lsc.easyblog.Repository.UserRepository;
//import com.lsc.easyblog.model.User;
//import com.lsc.easyblog.service.UserService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * @describe: 用户服务接口实现
// * @author: Lu Shengcan
// * @date: 2022-1-1, 周六, 15:28
// */
//@Service
//public class UserServiceImpl implements UserService {
//
//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//
//        this.userRepository = userRepository;
//    }
//
//    /**
//     * @describe: 查询所有用户
//     * @author: Lu Shengcan
//     * @date: 2022-1-1, 周六, 15:26
//     */
//    @Override
//    public List<User> findAllUser() {
//
//        return userRepository.findAll();
//    }
//
//    /**
//     * @describe: 增加用户
//     * @author: Lu Shengcan
//     * @date: 2022-1-2, 周日, 21:6
//     */
//    @Override
//    public void addUser(User user) {
//        userRepository.save(user);
//    }
//
//    /**
//     * @describe: 查询用户是否存在
//     * @author: Lu Shengcan
//     * @date: 2022-1-2, 周日, 23:36
//     */
//    public boolean checkUser(User user) {
//        // System.out.println("wrong password!");
//        if (userRepository.findByU_name(user.getUserName()) == null) {
//            // System.out.println("no such user");
//            return false;
//        } else {
//            // judge if password is right
//            return userRepository.findByU_name(user.getUserName()).getUserPassword().equals(user.getUserPassword());
//        }
//    }
//}
