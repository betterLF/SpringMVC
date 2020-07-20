package lesson03.JSON.test;

import lesson03.JSON.bean.Employee;
import lesson03.JSON.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author lifei
 * @date 2020/7/20 9:53
 */
@Controller
public class TestJsonController {
    @Autowired
    private EmployeeDao dao=new EmployeeDao();
    /**
     * Spring MVC处理Json的四个条件
     * 1:导入Jackson的jar
     * 2:在SpringMVC的配置文件中开启MVC驱动，<mvc:annotation-driven></mvc:annotation-driven>
     * 3:在处理ajax请求的方法上@ResponseBody
     * 4:将要转换为json且响应到客户端的数据直接作为该方法的返回值返回
     * @ResponseBody
     * @return
     */
    @RequestMapping("testJson")
    @ResponseBody
    public Collection<Employee> testJson(){
        Collection<Employee> emp = dao.getAll();
        return emp;
}
}
