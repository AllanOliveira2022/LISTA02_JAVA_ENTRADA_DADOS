import java.util.Scanner;
public class Q04_Dolar {
    public static void main(String args []){
        Scanner ler = new Scanner(System.in);
        float dolar;
        float cotacao;
        float reais;
        System.out.println("Digite a cotação do dólar: ");
        cotacao = ler.nextFloat();
        System.out.println("Digite o valor em Dólar: ");
        dolar = ler.nextFloat();

        reais = dolar * cotacao;
        System.out.println(reais);



    }
}
