package comb.designpattern.builder;

public class User {
    private String id;
    private String name;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return id +" : " + name;
    }

    public static class Builder{
        private String id;
        private String name;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public User Build(){
            return new User(this);
        }
    }
}
