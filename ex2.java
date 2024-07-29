import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // - Desenvolver um programa que leia a altura de um conjunto de pessoas. Este programa
        //deverá calcular e mostrar: o percentual de pessoas com altura menor ou igual 1.70 e o
        //percentual com altura maior que 1.70. Finalize a leitura de dados com uma altura
        //negativa.

        Scanner ler = new Scanner(System.in);
        
        System.err.println("Imforme sua altura: ");
        double altura = ler.nextDouble();
        int contmenor = 0;
        int contmaior = 0;
        int cont = 0;
        while (altura > 0) {

            if (altura <= 1.70) {
                contmenor++;
            }else{
                contmaior++;
            }


            System.err.println("Imforme sua altura: ");
            altura = ler.nextDouble();

            cont++;

        }


        double percentualMaior = (contmaior/(double)cont)*100;
        double percentualMenor = (contmenor/(double)cont)*100;

        System.out.println("Percentual de pessoas com altura menor ou igual a 1.70: " + percentualMaior + "%");
        System.out.println("Percentual de pessoas com altura maior que 1.70: " + percentualMenor + "%");
        

        
    }
    
}
