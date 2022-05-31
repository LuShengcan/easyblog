//package top.lushengcan.easyblog.Repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//import top.lushengcan.easyblog.model.User;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("select user from User user where user.userName=?1")
//    User findByU_name(String u_name);
//}
