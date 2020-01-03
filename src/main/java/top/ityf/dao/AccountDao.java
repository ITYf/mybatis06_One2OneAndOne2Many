package top.ityf.dao;


import top.ityf.domain.Account;
import top.ityf.domain.AccountUser;

import java.util.List;

/**
 * ClassName:Account
 * Package: top.ityf.dao
 * Description:
 *
 * @Date: 2019/11/20 14:14
 * @Author: YanFei
 */
public interface AccountDao {
    /**
     * 查询所有账户 ,同时还要获取到当前账户的所属用户信息
     * */
    List<Account> findAll();

    /**
     * 测试查询所有账户，同时包含用户名称和地址
     */
    List<AccountUser> findAllAccount();
}
