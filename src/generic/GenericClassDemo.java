package generic;
class Student<K,V>{
    private K name;
    private V age;

    public Student(K name, V age) {
        this.name = name;
        this.age = age;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
        Student<String, Integer> student = new Student<>("himanshu",24);
        System.out.println(student.getName());
    }
}
