import java.util.Scanner;

public class questao06 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    //6. Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.
    Scanner ler = new Scanner(System.in);
    int num, maior = 0, menor = 100, media = 0, soma = 0;
    int contMaior = 0, contMenor = 0, i;
    
    for(i = 0; i < 5; i++){
        System.out.println("Digite um número entre 0 e 100");
        num = ler.nextInt();
        
        // validação
        if( (num < 1) || (num > 100) ){
            i = i - 1;
        } else{
            // armazena os nº digitados
            soma = soma + num;

            // armazena o maior nº
            if(num > maior){
                maior = num;
                contMaior++;
            }

            // armazena o menor nº
            if(num < menor){
                menor = num;
                contMenor++;
            }   
        
        } // fim validação
    } // fim for
    
    System.out.println("O maior nº digitado foi " + maior);
    System.out.println("O menor nº digitado foi " + menor);
    System.out.println("A soma é "+ soma);
    System.out.println("A média foi " + (media = soma / i));

    ler.close();
    }

}

