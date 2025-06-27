package comb.collectionframework.map;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        HashMap<Person, String> map = new HashMap<>();
        map.put(p1, "Engineer"); //hashcode1 --> index1
        map.put(p2, "Designer");//hashcode2 --> index2
        map.put(p3, "Manager");//hashcode1 --> index1

        System.out.println("HashMap size: "+map.size());
        System.out.println("value for p1: "+map.get(p1));
        System.out.println("value for p3: "+map.get(p3));
        System.out.println(p1);


        /*Map<String, Integer> map1 = new HashMap<>();
        map1.put("Subham", 90);//hashcode1 --> index1
        map1.put("Ram", 98);//hashcode2 --> index2
        map1.put("Subham", 95);//hashcode1 --> index1
        System.out.println(map1);

         */

    }

}
class Person{
    private String name;
    private Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name , other.getName());
    }

    @Override
    public String toString() {
        return "id: "+id + ", name: " +name;
    }
}
