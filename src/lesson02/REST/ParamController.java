package lesson02.REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lifei
 * @date 2020/7/12 13:05
 */
@Controller
public class ParamController {
    /**
     * 在SpringMVC获取客户端传递的数据的方式:
     *1:在处理请求的方法中，加入相对应的形参，保证形参参数名和传递的数据的参数名保持一致，就可以自动赋值
     *2:value:当不满足赋值条件时可以使用value属性来指定映射关系
     *3:required:设置形参是否必须被赋值,默认为true,必须赋值，若设置为false，则不必须赋值，因此形参的值为null
     *4:defaultValue:若形参所获得的值为null，则设置一个默认值(分页，模糊查询)
     */
    @RequestMapping(value = "/param",method = RequestMethod.POST)
    public String param(@RequestParam(value="name",required = false,defaultValue = "admin") String username, String password, String age){
        System.out.println("username="+username+",password="+password+",age="+age);
        return "success02";
    }
}
