import java.util.Scanner;

public class 1049 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String tipo1 = input.nextLine();
        String tipo2 = input.nextLine();
        String tipo3 = input.nextLine();

        if ("vertebrado".equalsIgnoreCase(tipo1)) {

            if ("ave".equalsIgnoreCase(tipo2)) {     

                if ("carnivoro".equalsIgnoreCase(tipo3)) 
                    System.out.println("aguia");       

                else if ("onivoro".equalsIgnoreCase(tipo3))
                    System.out.println("pomba");
            }

            else if ("mamifero".equalsIgnoreCase(tipo2)) {

                if ("onivoro".equalsIgnoreCase(tipo3))
                    System.out.println("homem");
                
                else if ("herbivoro".equalsIgnoreCase(tipo3))
                    System.out.println("vaca");
            }
        } 

        else if ("invertebrado".equalsIgnoreCase(tipo1)) {

            if ("inseto".equalsIgnoreCase(tipo2)) {

                if ("hematofago".equalsIgnoreCase(tipo3))
                    System.out.println("pulga");
                
                else if ("herbivoro".equalsIgnoreCase(tipo3))
                    System.out.println("lagarta");
            }

            else if ("anelideo".equalsIgnoreCase(tipo2)) {

                if ("hematofago".equalsIgnoreCase(tipo3))
                    System.out.println("sanguessuga");

                else if ("onivoro".equalsIgnoreCase(tipo3))
                    System.out.println("minhoca");
            }
        }
    
        input.close();

    }
}
