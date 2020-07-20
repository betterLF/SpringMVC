package lesson03.JSON.bean;

/**
 * @author lifei
 * @date 2020/7/18 17:02
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Department() {
    }
    public Department(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
