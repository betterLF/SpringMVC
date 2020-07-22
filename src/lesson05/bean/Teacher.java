package lesson05.bean;

/**
 * @author lifei
 * @date 2020/7/22 10:03
 */
public class Teacher {
    private Integer id;
    private String name;

    public Teacher() {
        System.out.println("Teacher:构造方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
