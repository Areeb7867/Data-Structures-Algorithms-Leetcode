import java.util.Scanner;
import java.util.ArrayList;
        //USING ARRAY LIST IN ARRAY LIST

public class ArrayListinArrayList {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initializing
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());

        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());// cannot use get until arraylist is initialized

            }


        }
        System.out.println(list);

    }
}
