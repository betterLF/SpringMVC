package lesson04.Interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lifei
 * @date 2020/7/21 8:45
 */
@Controller
public class TestInterceptor {
    /*
    当有多个拦截器时
    preHandle:按照拦截器数组的正向顺序执行(springmvc默认有一个拦截器)
    postHandle:按照连接器数组的反向顺序执行
    afterCompletion:按照连接器数组的反向顺序执行

    当多个拦截器的preHandle有不同的值时
    第一个和第二个都返回false时，只有第一个preHandle会执行
    第一个返回true，第二个返回false时，两个拦截器的preHandle都会执行，但是postHandle都不会执行
    而afterCompletion只有第一个会执行(即返回false的拦截器前的拦截器的afterCompletion都执行)
    第一个返回false，第二个返回true时,只有第一个的postHandle会执行
     */
    @RequestMapping("/testInterceptor")
public String testInterceptor(){
    return "success";
}
}
