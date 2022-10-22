import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) throws Exception {
    //3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os números entre os 2 digitados.
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva um número:");
    int num1 = ler.nextInt(); //lendo o número
    System.out.println("---------------");
    System.out.println("Escreva outro número:");
    int num2 = ler.nextInt(); //lendo o número
    
    if (num1 < num2) {
        for (int i = (num1 + 1); i < num2; i++) {
        System.out.println("Os números entre eles são: "+i);  
        }
    } else {
        for (int i = (num2 + 1); i <= (num1 - 1); i++) {
            System.out.println("Os números entre eles são: "+i);  
            }
    }
    ler.close();
    }
}

