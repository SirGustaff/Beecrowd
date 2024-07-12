import java.util.Scanner;

public class 1960 {

    public static String[] hundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    public static String[] dozens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    public static String[] units = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int i;

        int div;

        String numLenght = Integer.toString(n);

        String numRomam = "";

        if (numLenght.length() == 3) {i = 0; div = 100;}
            
        else if (numLenght.length() == 2) {i = 1; div = 10;}
    
        else {i = 2; div = 1;}
            
            for (; i < 3; i++, div /= 10) {

                int resto = n % div;

                n /= div;

                if (i == 0) {

                    switch (n) {
                        case 1:
                                numRomam += hundreds[0];
                            break;

                        case 2:
                                numRomam += hundreds[1];
                            break;                            
        
                        case 3:
                                numRomam += hundreds[2];
                            break;
                            
                        case 4:
                                numRomam += hundreds[3];
                            break;

                        case 5:
                                numRomam += hundreds[4];
                            break;

                        case 6:
                                numRomam += hundreds[5];
                            break;

                        case 7:
                                numRomam += hundreds[6];
                            break;

                        case 8:
                                numRomam += hundreds[7];
                            break;

                        case 9:
                                numRomam += hundreds[8];
                            break;
                    
                        default:
                            break;
                    }
                
                }

                else if (i == 1) {

                    switch (n) {
                        case 1:
                                numRomam += dozens[0];
                            break;

                        case 2:
                                numRomam += dozens[1];
                            break;                            
        
                        case 3:
                                numRomam += dozens[2];
                            break;
                            
                        case 4:
                                numRomam += dozens[3];
                            break;

                        case 5:
                                numRomam += dozens[4];
                            break;

                        case 6:
                                numRomam += dozens[5];
                            break;

                        case 7:
                                numRomam += dozens[6];
                            break;

                        case 8:
                                numRomam += dozens[7];
                            break;

                        case 9:
                                numRomam += dozens[8];
                            break;
                    
                        default:
                            break;
                    }

                }

                else if (i == 2) {

                    switch (n) {
                        case 1:
                                numRomam += units[0];
                            break;

                        case 2:
                                numRomam += units[1];
                            break;                            
        
                        case 3:
                                numRomam += units[2];
                            break;
                            
                        case 4:
                                numRomam += units[3];
                            break;

                        case 5:
                                numRomam += units[4];
                            break;

                        case 6:
                                numRomam += units[5];
                            break;

                        case 7:
                                numRomam += units[6];
                            break;

                        case 8:
                                numRomam += units[7];
                            break;

                        case 9:
                                numRomam += units[8];
                            break;
                    
                        default:
                            break;
                    }
                    
                }

                n = resto;

                input.close();

            }

        System.out.println(numRomam);
            
    }

}
