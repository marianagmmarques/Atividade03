import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) throws Exception {
    //1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.    
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva um número:");
    int num = ler.nextInt(); //lendo o número
    System.out.println("---------------");
    System.out.println("Tabuada:");
    System.out.println("---------------");

    for (int i = 1; i <= 10; i++) {
        System.out.println(num+" + "+i+" = "+(num+i)); //Adicionando número digitado a frente depois número do laço, depois o cálculo soma
    }

    System.out.println("---------------");

    for (int i = 1; i <= 10; i++) {
        System.out.println(num+" - "+i+" = "+(num-i)); //Adicionando número digitado a frente depois número do laço, depois o cálculo subtração
    }

    System.out.println("---------------");

    for (int i = 1; i <= 10; i++) {
        System.out.println(num+" x "+i+" = "+(num*i)); //Adicionando número digitado a frente depois número do laço, depois o cálculo multiplicação
    }

    System.out.println("---------------");

    for (int i = 1; i <= 10; i++) {
        System.out.println(num+" / "+i+" = "+(num/i)); //Adicionando número digitado a frente depois número do laço, depois o cálculo divisão
    }

    ler.close();
    }
}
