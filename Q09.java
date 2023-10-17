import java.util.Scanner;
public class Q09 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int valor[] = new int[3];
        int valorInvertido[] = new int[3];
        System.out.println("Informe um valor com 3 digitos: ");
        for(int i = 0; i <= 2; i++){
            System.out.printf("Digito %d: ", i +1);
            valor[i] = ler.nextInt();
        }
        for(int i = 2; i >=0; i--){
            valorInvertido[2-i] = valor[i];
        }

        System.out.println("Valor invertido: ");
        for(int i = 0; i <= 2; i++){
            System.out.print(valorInvertido[i]);
        }

    }
}
