package rest_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rest_crud.bean.Department;
import rest_crud.bean.Employee;
import rest_crud.dao.DepartmentDao;
import rest_crud.dao.EmployeeDao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author lifei
 * @date 2020/7/18 18:23
 */
@Controller
public class EmpController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;
    /*
    获取所有的员工信息
     */
    @RequestMapping(value = "/emps")
    public String getAll(Map<String,Object> map){
        Collection<Employee> emps = employeeDao.getAll();
        map.put("emps",emps);
        return "list";
    }
    /*
           跳转到添加页面
     */
//    @RequestMapping(value = "/emp",method = RequestMethod.GET)
//    public String toAdd(Map<String,Object> map){
//        Collection<Department> departments = departmentDao.getDepartments();
//        map.put("departments",departments);
//        return "add";
//    }
    /*
    使用添加员工
     */
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String addEmp(Employee employee){
        employeeDao.save(employee);
                return "redirect:/emps";
    }
    /*
    实现修改员工信息
     */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id")Integer id,Map<String,Object> map){
        //获取要修改的员工信息
        Employee employee = employeeDao.get(id);
        //获取所有的部门信息，供用户选择
        Collection<Department> departments = departmentDao.getDepartments();
        map.put("departments",departments);
        map.put("employee",employee);
        Map<String,String> genders=new HashMap<>();
        genders.put("0","女");
        genders.put("1","男");
        //设置存储性别的map集合
        map.put("genders",genders);
        //return "update";
        return "edit";
    }
    /*
    获取要回显的数据，跳转到修改页面并回显
     */
    @RequestMapping(value ="/emp",method = RequestMethod.PUT)
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    /*
         编辑员工信息
     */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String toEdit(Map<String,Object> map){
        Collection<Department> departments = departmentDao.getDepartments();
        Map<String,String> genders=new HashMap<>();
        genders.put("0","女");
        genders.put("1","男");
        map.put("departments",departments);
        //设置存储性别的map集合
        map.put("genders",genders);
        //form标签有自动回显的功能，会在页面中默认获取request作用于command属性的值
//        map.put("command",new Employee());
        //若在<form:form>设置了modelAttribute,就可以自定义回显对象的属性名
        map.put("employee",new Employee());
        return "edit";
    }
    /*
    删除员工信息
     */
    @RequestMapping(value ="/emp/{id}",method = RequestMethod.DELETE)
    public  String deleteEmp(@PathVariable("id")Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
