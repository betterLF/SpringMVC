package rest_crud.dao;

import org.springframework.stereotype.Repository;
import rest_crud.bean.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lifei
 * @date 2020/7/18 17:03
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments=null;
    static {
        departments=new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"D-AA"));
        departments.put(102,new Department(102,"D-BB"));
        departments.put(103,new Department(103,"D-CC"));
        departments.put(104,new Department(104,"D-DD"));
        departments.put(105,new Department(105,"D-EE"));
    }
    public Collection<Department> getDepartments(){
        return departments.values();
    }
    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}
