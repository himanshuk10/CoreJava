package comb.CoreJavaInterview.exceptions;



public class ExceptionDemo {
    private Integer age;
    public void doVote(int age) throws MyCustomException {
        if (age < 18){
            throw new MyCustomException("Person is not eligible for vote because age is "+ age);
        }
        System.out.println("Thank you for vote person age is: "+age);
    }
    public static void main(String[] args){
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        try {
            exceptionDemo.doVote(20);
            exceptionDemo.doVote(12);
        } catch (MyCustomException e) {
            System.out.println("Custom Exception caught, " + e.getMessage());
        }
    }
}
