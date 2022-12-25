package access_modifier;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


}
class Test  {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Nhi");
        st.setClasses("A0922I1");
        System.out.println(st.getName());
        System.out.println(st.getClasses());
    }
}
