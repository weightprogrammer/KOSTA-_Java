package Game;

import java.util.Scanner;


public class BaseballGameTest {
    
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            BaseballGame game1 = new BaseballGame();
            game1.setNum();
    
            for(int i=0 ; i<15 ; i++) {
                
                game1.getNum(sc.nextInt(), sc.nextInt(), sc.nextInt());
                
            }
    
        }
 
}