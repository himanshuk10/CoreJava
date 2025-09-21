package comb.designpattern.builder;

public class Customer {
    private String id;
    private String name;
    private String address;
    private String email;
    private String designation;
    private Long salary;

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.email = builder.email;
        this.designation = builder.designation;
        this.salary = builder.salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;
        private String address;
        private String email;
        private String designation;
        private Long salary;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Builder setSalary(Long salary) {
            this.salary = salary;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
