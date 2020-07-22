package lesson05.Controller;

import lesson05.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author lifei
 * @date 2020/7/22 9:57
 */
@Controller
public class TestController_02 {
    @RequestMapping("/testListener")
    public  String testListener(HttpSession session){
        //获取spring所管理的teacher对象
      ApplicationContext ac = (ApplicationContext)session.getServletContext().getAttribute("ac");
        Teacher teacher = ac.getBean("teacher", Teacher.class);
        System.out.println(teacher);
        return "success";
    }
}
