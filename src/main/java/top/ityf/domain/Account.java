package top.ityf.domain;

import java.io.Serializable;

/**
 * ClassName:Account
 * Package: top.ityf.domain
 * Description:
 *
 * @Date: 2019/11/20 14:12
 * @Author: YanFei
 */
public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private Double money;

    //一个账户只对应一个用户，一对一，从表实体应该包含一个主表实体的对象引用
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 重写toString()方法，修改成我们想要看到的信息
     * */
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
//                ", username=" + user.getUsername()+
//                ", address=" + user.getAddress()+
                ", money=" + money +
                '}';
    }
}
