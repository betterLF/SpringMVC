package lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lifei
 * @date 2020/7/11 10:20
 */
@Controller
public class Test {
     /**
     *View类型:处理模型数据，实现页面跳转(转发，重定向)
     * InternalResourceView:转发视图
     * JstLView:转发视图
     * RedirectView:重定向视图
     */
//     @RequestMapping("/ttt")
//     public String ttt(){
////        return "forward:/WEB-INF/view/success.jsp";//视图名称(forward要去掉视图解析器的前后缀配置)
//     }
    @RequestMapping(value = "/ttt",method = RequestMethod.GET)
    public String ttt(){
        return "redirect:https://www.imooc.com/wenda/detail/504109";
    }
}