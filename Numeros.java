package Tema5;
import java.util.Scanner;
public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int num = Integer.parseInt(sc.nextLine());

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if ((num%0)==0) {
                primo = false;
            }
            
        }
        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
            System.out.println("Hola mundo desde main");
	

        System.out.println("Hola mundo xd");

        System.out.println("Holamundo2");
    }
}
