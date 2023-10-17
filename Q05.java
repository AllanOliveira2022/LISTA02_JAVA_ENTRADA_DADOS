import java.util.Scanner;
public class Q05 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int idadeAnos;
        int idadeMes;
        int idadeDia;
        int completa;

        System.out.println("Informe sua idade (ANOS)");
        idadeAnos = ler.nextInt();
        System.out.println("Meses da sua idade: ");
        idadeMes = ler.nextInt();
        System.out.println("Dias da idade: ");
        idadeDia = ler.nextInt();

        completa = (idadeAnos * 365) + (idadeMes * 30) + idadeDia; 
        System.out.println("Sua idade completa em dias é: " + completa);

    }
}
