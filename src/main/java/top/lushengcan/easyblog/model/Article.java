package top.lushengcan.easyblog.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @describe: 文章类
 * @author: Lu Shengcan
 * @date: 2022/2/7, 周一, 0:9
 */
@Data
@Entity
@Table(name = "eb_article")
public class Article {

    /**
     * @describe: 主键
     * @type: long
     * @author: Lu Shengcan
     * @date: 2022/2/7, 周一, 0:8
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键，设置自增策略为自动
    private long articleId;

    /**
     * @describe: 文章标题
     * @type: String
     * @author: Lu Shengcan
     * @date: 2022/2/7, 周一, 0:7
     */
    @Column(nullable = false)
    private String articleTitle;

    /**
     * @describe: 文章内容
     * @type: String
     * @author: Lu Shengcan
     * @date: 2022/2/6, 周日, 16:36
     */
    @Column(columnDefinition = "TEXT")
    private String articleContent;

    /**
     * @describe: 文章创建时间
     * @type: Date
     * @author: Lu Shengcan
     * @date: 2022/2/6, 周日, 16:35
     */
    @Column(nullable = false)
    private Date articleCreatedTime;

    /**
     * @describe: 文章最后修改时间
     * @type: Date
     * @author: Lu Shengcan
     * @date: 2022/2/6, 周日, 16:35
     */
    @Column(nullable = false)
    private Date articleModifiedTime;

    /**
     * @describe: 文章用户 Id
     * @type: long
     * @author: Lu Shengcan
     * @date: 2022/2/6, 周日, 16:3
     */
    @Column
    private long userId;

    public Article() {

    }
}
