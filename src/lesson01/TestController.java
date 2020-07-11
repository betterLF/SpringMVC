package lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lifei
 * @date 2020/7/11 10:20
 */
@Controller
public class TestController {
    /**
     * 假设:localhost:8081/SpringMVCDemo/hello
     */
    @RequestMapping("/hello")
    public String hello(String username,String password){
        System.out.println(username+","+password);
        return "success";//视图名称
    }
}
