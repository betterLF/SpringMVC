package lesson02.REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lifei
 * @date 2020/7/12 9:30
 */
@Controller
public class RESTController {
    @RequestMapping(value = "/testREST/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("GET,id="+id);
        return  "success02";
    }
    @RequestMapping(value = "/testREST",method = RequestMethod.POST)
    public String insertUser(){
        System.out.println("POST");
        return  "success02";
    }

    @RequestMapping(value = "/testREST",method = RequestMethod.PUT)
    public String updateUser(){
        System.out.println("PUT");
        return  "success02";
    }
    @RequestMapping(value = "/testREST/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("DeLETE,id="+id);
        return  "success02";
    }
    @RequestMapping(value = "/testAjax_DELETE",method = RequestMethod.DELETE)
    public void textAjax_Delete(Integer id){
        System.out.println("testAjax_Delete,id="+id);
    }
}
