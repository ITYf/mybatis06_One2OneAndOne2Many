package top.ityf.dao;

import top.ityf.domain.User;

import java.util.List;

/**
 * ClassName:UserDao
 * Package: top.ityf.dao
 * Description: 用户的持久层接口
 *
 * @Date: 2019/11/19 8:27
 * @Author: YanFei
 */
public interface UserDao {
    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     */
    List<User> findAll();


    /**
     * 根据Id查询用户
     */
    User findById(Integer userId);


}
