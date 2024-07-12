import java.util.Scanner;

public class 1168 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {

            int ref = 0;

            int ledSum = 0;

            String wholeNum = input.next();

            for (int j = 0; j < wholeNum.length(); j++) {

                int num = Integer.parseInt(wholeNum.substring(ref, ++ref));

                switch (num) {
                    case 1:
                        ledSum += 2;
        
                        break;

                    case 2:
                        ledSum += 5;

                        break;

                    case 3:
                        ledSum += 5;
                    
                        break;
                    
                    case 4:
                        ledSum += 4;

                        break;

                    case 5:
                        ledSum += 5;
                        
                        break;

                    case 6:
                        ledSum += 6;

                        break;

                    case 7:
                        ledSum += 3;
                    
                        break;
                    
                    case 8:
                        ledSum += 7;

                        break;

                    case 9:
                        ledSum += 6;

                        break;

                    case 0:
                        ledSum += 6;

                        break;
                
                    default:
                        break;
                }

            }

            System.out.println(ledSum + " leds");
           
        }

        input.close();
    }
}
