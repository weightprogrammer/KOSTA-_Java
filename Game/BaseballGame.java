package Game;

import java.util.Random;

public class BaseballGame {
    
    static int gameCnt = 0;                
    static int strCnt = 0;
    static int ballCnt = 0;
    static int ball = 0;
    static int strike = 0;
    static int number1;                                                            
    static int number2;
    static int number3;
    
    // 3개의 랜덤숫자 정답 설정 (0~9)
    public void setNum() {                                                        
        
        boolean stop = false;
        Random random = new Random();
            
        while(!stop) {
            number1 = random.nextInt(10);
            number2 = random.nextInt(10);
            number3 = random.nextInt(10);
            
            if((number2==number1) || (number2==number3)) {                        //     같은 숫자가 있을 경우 재설정
                number2 = random.nextInt(10);
            }else if((number3==number1) || (number3==number2)) {
                number3 = random.nextInt(10);
            }else {
                stop = true;
            }
        }
        System.out.println("******** 숫자 야구게임을 시작합니다! ********"); 
        System.out.println("( 0 ~ 9사이의 숫자 3개를 입력해주세요. )");
        
    }
    
    
    // user로부터 3개의 입력을 받는 메소드
    public void getNum(int num1, int num2, int num3) {                            
                    
        strCnt = cntStrike(num1, num2, num3);
        ballCnt = cntBall(num1, num2, num3);
        gameCnt++;
                
        System.out.println("(" + gameCnt + "번째 시도)");
        System.out.println("입력한 숫자 => "+num1+", "+num2+", "+num3+"\t결과 => "+"S: "+ strCnt + " /B: " + ballCnt);
        System.out.println("-------------------------------------------");
        
        checkAns();
    }
        
    
    // 3개의 입력의 숫자를 확인하는 메소드
    public static int cntBall(int a, int b, int c) {                            
        
        ball = 0; 
        
        if((a == number2) || (a == number3)) 
            ball++;
        if((b == number1) || (b == number3)) 
            ball++;
        if((c == number1) || (c == number2)) 
            ball++;
        
        return ball;
    }
    
        
    // 3개의 입력의 자리수를 확인하는 메소드
    public static int cntStrike(int a, int b, int c) {                            
        
        strike = 0;
        
        if((a == number1)) 
            strike++;
        if(b == number2) 
            strike++;
        if(c == number3) 
            strike++;
        
        return strike;
    }
        
    
    //    정답 체크하는 메소드 
    public static void checkAns() {                                                
            
        if(gameCnt >= 10) {
            System.out.println("<<<<<<<<<<<<<< Game OVER !! >>>>>>>>>>>>>>>");                    // gameCnt(게임시도횟수)가 10회이상이면 게임오버
            System.out.printf("정답은 %d, %d, %d였습니다.", number1, number2, number3);
        }else if(strCnt == 3){
            System.out.println("======= Game WIN!! 정답을 맞추셨습니다. =======");            
            // strCnt가 3개이면 게임 우승.
        }
    }


	
    
    
} //Class Ended
 