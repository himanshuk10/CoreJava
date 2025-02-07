package sort;

import java.util.*;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,22,3,14);
        Collections.sort(list);
        System.out.println(list);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Hp",16, 700));
        laptops.add(new Laptop("Apple",8, 1200));
        laptops.add(new Laptop("Dell",12, 800));

        for (Laptop lap: laptops) {
            System.out.println(lap);
        }
        System.out.println("----------------------------------");

        //Comparable
//        Collections.sort(laptops);
//        for (Laptop lap1 : laptops){
//            System.out.println(lap1);
//        }

        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getPrice()>o2.getPrice()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        //sort on the basic of length of name

        Comparator<Laptop> comparator1 = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lap1, Laptop lap2) {
                if(lap1.getName().length() > lap2.getName().length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(laptops,comparator1);
        for (Laptop lap: laptops) {
            System.out.println(lap);
       }

//        List<LaptopExternal> laptops = new ArrayList<>();
//        laptops.add(new LaptopExternal("Hp",16, 700));
//        laptops.add(new LaptopExternal("Apple",8, 1200));
//        laptops.add(new LaptopExternal("Dell",12, 8000));
//
//        Comparator<LaptopExternal> laptopExternalComparator = new Comparator<LaptopExternal>() {
//            @Override
//            public int compare(LaptopExternal lap1, LaptopExternal lap2) {
//                if(lap1.getPrice()>lap2.getPrice())
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//
//        Collections.sort(laptops, laptopExternalComparator);
//        for (LaptopExternal lap: laptops) {
//            System.out.println(lap);
//        }

    }
}
//                  comparable                          comparator
//comparable provide single sorting sequence - comparator provide multiple sorting sequence
//it changes the actual class definition     - it doen not changes class definition
// having compareTo() method                 - having compare() method
