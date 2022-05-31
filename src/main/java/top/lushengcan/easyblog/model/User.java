package top.lushengcan.easyblog.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @describe: 用户类
 * @author: Lu Shengcan
 * @date: 2022/2/7, 周一, 0:12
 */
@Entity
@Data
@Table(name = "eb_user")
public class User {

    /**
     * @describe: 主键
     * @type: long
     * @author: Lu Shengcan
     * @date: 2022/2/7, 周一, 0:12
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private long userId;

    /**
     * @describe: 用户名
     * @type: String
     * @author: Lu Shengcan
     * @date: 2022/2/7, 周一, 0:12
     */
    @Column
    private String userName;

    /**
     * @describe: 用户密码
     * @type: String
     * @author: Lu Shengcan
     * @date: 2022/2/7, 周一, 0:12
     */
    @Column
    private String userPassword;


}
