package java8Features;

import java.util.Optional;

public class OptionalDemo {

    public static Optional<String> getMessage(){
        String str = null;
        return Optional.ofNullable(str);

    }
    public static void main(String[] args) {

        String str = null;
        Optional optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
//        System.out.println(optional.get());

        System.out.println(optional.orElse("no value in this object"));
//
        Optional<String> optional1 = getMessage();
        System.out.println(optional1.orElse("Method return null message"));

    }
}
/*.......................................................................
 * The Optional class is a container object which may or may not contain a non-null value.
 * used to deal with NullPointerException or null value in Java application.
 * see method example -> good practice is to make method return type is optional
 * not instance variable declaration type
 *.......................................................................*/

