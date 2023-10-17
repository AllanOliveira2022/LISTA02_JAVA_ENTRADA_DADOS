import java.util.Scanner;
public class Q02_ConverterTemp {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        float tempCelcius;
        float tempF;
        System.out.println("Digite a temperatura em Celsius: ");
        tempCelcius = ler.nextFloat();

        // converter
        tempF = (9 * tempCelcius + 160) / 5;
        System.out.println(tempCelcius + "° em Celsius é " + tempF +"° Fahrenheit.");

    }

}