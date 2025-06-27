package comb.CoreJavaInterview.enumDemo;

enum Status{
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s.ordinal());

        /*
        //want to print all status with num
        Status[] ss = Status.values();
        for(Status s : ss){
            System.out.println(s+" : "+s.ordinal());
        }
         */


        /*
        //If-else on enum
        Status s = Status.Success;
        if(s==Status.Running)
            System.out.println("All good");
        else if (s==Status.Pending)
            System.out.println("Please wait");
        else if(s==Status.Failed)
            System.out.println("Tru again");
        else
            System.out.println("Done");
         */

        switch (s){
            case Running -> System.out.println("All Good");
            case Pending -> System.out.println("Please wait");
            case Failed -> System.out.println("Try again");
            default -> System.out.println("Done..");
        }


    }
}
