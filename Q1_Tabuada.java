import java.util.Scanner;
public class Q1_Tabuada{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int num;
        int resultado;
        System.out.println("------ TABUADA -----");
        System.out.println("Digite um número de 1 a 9: ");
        num = ler.nextInt();

        System.out.println("---RESULTADO---");
        for(int i=1; i<=10; i++){
            resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }

        
    }
}