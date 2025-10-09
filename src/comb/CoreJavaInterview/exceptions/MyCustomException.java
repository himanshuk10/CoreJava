package comb.CoreJavaInterview.exceptions;

public class MyCustomException extends Exception{
    private String message;
    public MyCustomException(String message){
        super(message);
    }
}
