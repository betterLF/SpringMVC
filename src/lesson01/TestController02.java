package lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lifei
 * @date 2020/7/11 16:51
 */

/**
 * @RequestMapping： 设置请求映射，把请求和控制层中的方法设置映射关系
 * 当请求路径和@RequestMapping的value属性值一样时，则该注解所标准的方法即为处理请求的方法
 * @RequestMapping 可以加在类上，也可以加在方法上
 * 若类和方法上都有，应该一层一层地访问，先访问类再访问类中的方法1
 * method:用来设置请求方式，只有客户端发送请求的方式和method的值一致时，才能处理请求
 * 请求方式:GET(查询),POST(添加),PUT(修改),DELETE(删除),还有另外4个不常用的
 * params：用来设置客户端传到服务器的数据，支持表达式
 * username 代表请求要有username !username代表没有username
 * headers  用来设置请求头信息，所发送的请求头信息一定要和headers属性中所设置的一致
 *如{"Accept-Language: zh-CN,zh;q=0.9"}
 */
@Controller
@RequestMapping("/mvc")
public class TestController02 {
    @RequestMapping(value = "/test",method= RequestMethod.GET)
    private String testGET(){
        System.out.println("test success:GET");
        return  "success02";
    }
    @RequestMapping(value = "/test",
            method= RequestMethod.POST,
            params = {"!username","!age"},
            headers ={"Accept-Language: zh-CN,zh;q=0.9"} )
    private String testPOST(){
        System.out.println("test success:POST");
        return  "success02";
    }
}
