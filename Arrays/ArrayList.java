import java.util.ArrayList;
import java.util.Scanner;

public class arraylsit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); // initializing arrayList
        // adding elements to array list
        list.add(123);
        list.add(12);
        list.add(1233);
        list.add(532);

        list.contains(123); // checking if this contains the element in the array
        System.out.println(list.contains(123));
        list.set(0,99); // creating or replacing  value at particular index
        list.remove(0); // deleting index
        System.out.println(list);



//loops for input
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());

        }
        //items at every index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i)); //passing index list[index] does not work here


        }
    }
}
