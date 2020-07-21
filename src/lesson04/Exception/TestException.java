package lesson04.Exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lifei
 * @date 2020/7/21 10:11
 */
@Controller
public class TestException {
    @RequestMapping(value = "/testException",method = RequestMethod.GET)
    public String testException(){
        String s=null;
        System.out.println(s.substring(0,5));
        return "success";
    }
}
