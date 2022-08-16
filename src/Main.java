import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void adivinador(){
        Scanner sc = new Scanner(System.in);
        int aleatorio1 = (int)(Math.random()*10+1);
        System.out.println(aleatorio1);
        System.out.println("Ingrese un numero");
        int usuario = sc.nextInt();
        if (usuario == aleatorio1){
            System.out.println("Usted adivino");
        }else if(usuario > aleatorio1){
            System.out.println("Numero mayor");
        }else if(usuario < aleatorio1){
            System.out.println("Numero menor");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

