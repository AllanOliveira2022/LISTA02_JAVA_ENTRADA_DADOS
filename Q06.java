import java.util.Scanner;
public class Q06 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int duracao;
        int hora, minuto,segundo;

        System.out.println("Digite a dujração do evento (segundos):");
        duracao = ler.nextInt();
        hora = duracao / 3600;
        minuto = (duracao % 3600) / 60;
        segundo = (duracao % 3600) % 60;

        



        System.out.printf("Duração do evento: %d : %d : %d", hora, minuto, segundo);


    }
    
}
