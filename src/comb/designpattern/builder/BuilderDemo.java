package comb.designpattern.builder;

public class BuilderDemo {
    public static void main(String[] args) {
//        User build = new User.Builder().setId("user123").setName("Himanshu").Build();
//        System.out.println(build);

//        Employee employee = new Employee.Builder()
//                .setId("123")
//                .setName("Aman")
//                .setEmail("abc@123")
//                .setAddress("Delhi")
//                .setDesignation("Engineer")
//                .build();
//        System.out.println(employee);

        Customer customer = new Customer.Builder()
                .setId("emp123")
                .setName("Alexa")
                .setEmail("xyz@123")
                .setAddress("Noida")
                .setDesignation("tester")
                .setSalary(1234567L)
                .build();
        System.out.println(customer);
    }
}
