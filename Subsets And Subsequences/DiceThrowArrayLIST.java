
import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(diceret("", 4));
    }
    /*
    static void diceroll(String p , int target){
        if(target == 0 ){
            System.out.println(p);
            return ;
        }
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            diceroll(p+i , target-i);
        }

     */
    static ArrayList<String> diceret(String p , int target){
        if(target == 0 ){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p);
            return list ;
        }
        ArrayList<String> list = new ArrayList<>() ;
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            list.addAll(diceret(p+i , target-i ));
        }
        return list ;
    }
}
