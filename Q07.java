import java.util.Scanner;
public class Q07 {
    public static void main(String args[]){
        Scanner ler=new Scanner(System.in);
        int valor, nota100, nota50, nota10, nota5, nota1;

        System.out.println("Informe o valor do saque: ");
        valor = ler.nextInt();

        nota100 = valor / 100;
        nota50 = (valor % 100) / 50;
        nota10 = ((valor % 100) % 50)/ 10;
        nota5 = (((valor % 100) % 50)% 10) / 5;
        nota1 = ((((valor % 100) % 50)% 10) % 5) / 1;

        System.out.println("Você pode sacar em notas de:");
        System.out.printf("%d notas de 100\n", nota100);
        System.out.printf("%d notas de 50\n", nota50);
        System.out.printf("%d notas de 10\n", nota10);
        System.out.printf("%d notas de 5\n", nota5);
        System.out.printf("%d notas de 1\n", nota1);


        


    }
}
