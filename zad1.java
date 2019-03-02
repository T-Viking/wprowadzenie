package wprowadzenie;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        for(int i = 1; i<=x; i++){
            System.out.printf("%d\n",i);
        }
    }
}
