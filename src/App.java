import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);

        System.out.println("Skriv Tal 1: ");
        int tal1 = tb.nextInt();
        System.out.println("Skriv tal 2:");
        int tal2 = tb.nextInt();

        if(tal1 == tal2)
        {
            System.out.println("SANT");
        }
        else
        {
            System.out.println("FALSKT");
        }
        if(tal1 < tal2)
        {
            System.out.println("SANT");
        }
        else
        {
            System.out.println("FALSKT");
        }
        if(tal1 > tal2)
        {
            System.out.println("SANT");
        }
        else
        {
            System.out.println("FALSKT");
        }



        int[] talen = {4, 5, 2};
        
        int forstaElement = talen[0];
        int andraElement = talen[1];
        int tredjeElement = talen[2];
        
        if (forstaElement > andraElement || forstaElement > tredjeElement) {
            System.out.println("1:a elementet är större än 2:a ELLER 3:e elementet");
        }
        
        if (forstaElement < andraElement || forstaElement < tredjeElement) {
            System.out.println("1:a elementet är mindre än 2:a ELLER 3:e elementet");
        }
        
        if (forstaElement == andraElement || forstaElement == tredjeElement) {
            System.out.println("1:a elementet är lika med 2:a ELLER 3:e elementet");
        }
    }
}

