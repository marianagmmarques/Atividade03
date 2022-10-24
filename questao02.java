import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) throws Exception {
    //2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva um mensagem:");
    String msg = ler.nextLine(); //lendo a mensagem
    System.out.println("Digite quantas vezes a mensagem se repetirá:");
    int num = ler.nextInt(); //lendo o número
    System.out.println("---------------");
    int i = 1;

    while (i <= num) {
        i++;
        System.out.println(msg);
    }

    //for (int i = 1; i <= num; i++) {
    //        System.out.println(msg); // Repetindo a quantidade desejada
    //    }

    ler.close();
    }
}


