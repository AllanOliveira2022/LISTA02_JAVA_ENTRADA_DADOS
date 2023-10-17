import java.util.Scanner;
public class Q03 {
    public static void main(String args []){
        Scanner ler = new Scanner(System.in);
        float tempGasto;
        float velocidade;
        float distancia;
        float litrosUsados;

        System.out.print("Informe o tempo gasto (HORAS): ");
        tempGasto = ler.nextFloat();
        System.out.print("Informe a velocidade média (KM/H):");
        velocidade = ler.nextFloat();
        System.out.println("");
        distancia = tempGasto * velocidade;
        System.out.println("Distancia percorrido: " + distancia + "KM");
       
        litrosUsados = distancia /12;
        System.out.println("Litros gastos: "+ litrosUsados + "L");
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Tempo gasto: " + tempGasto);
        





    }
}
