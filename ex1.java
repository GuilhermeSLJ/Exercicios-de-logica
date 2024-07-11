import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1 {
    public static void main(String[] args) {
        // - Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura
        //e sexo (“F”, “M”) das pessoas. Elabore um programa que leia 50 dados diferentes e
        //informe: a maior altura encontrada, a média de altura das mulheres, a média de altura da
        //população e o percentual de homens na população.
        float soma = 0;
        float maior_altura = 0;
        float menor_altura = 0;
        float soma_alturaM = 0;
        int contM = 0;
        int contF = 0;
        int i = 0;
        Scanner ler = new Scanner(System.in);
        for( i = 0; i < 5; i++){

            System.out.println("Qual a sua altura?");
            float altura = ler.nextFloat();
            ler.nextLine();

            System.out.println("Qual o seu sexo [F/M]?");
            String sexo = ler.nextLine();

            // maior e menor altura
            if (altura > maior_altura) {
                maior_altura = altura;
            }
            if (altura < menor_altura) {
                menor_altura = altura;
            }
            
            // soma altura total
            soma = altura + soma;

             // soma altura mulher    
             if (sexo.equalsIgnoreCase("F")) {
                soma_alturaM += altura;
                contF++;
            }

            // Soma dos homens
            if (sexo.equalsIgnoreCase("M")) {
                contM++;
            }

        }

        int per_homens = (contM * 100)/i;       
        float media = soma/i;
        float media_alturaM = soma_alturaM/contF;


        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Maior altra entra a população: " + df.format(maior_altura));
        System.out.println("Media de altura das mulheres: " + df.format(media_alturaM));
        System.out.println("Media de altura total: " + df.format(media));
        System.out.println("Porcentagem de homens: " + per_homens +"%");



    }
    
}
