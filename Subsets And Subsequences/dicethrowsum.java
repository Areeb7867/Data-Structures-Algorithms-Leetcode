
public class dice {
    public static void main(String[] args) {
        diceroll("",4);
        

    }
    static void diceroll(String p , int target){
        if(target == 0 ){
            System.out.println(p);
            return ;
        }
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            diceroll(p+i , target-i);
        }
    }
}
