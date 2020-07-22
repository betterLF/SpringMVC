package lesson05.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author lifei
 * @date 2020/7/22 9:10
 */
@Component
public class User {
    private Integer id;
    private String username;

    public User() {
        System.out.println("User:构造方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
