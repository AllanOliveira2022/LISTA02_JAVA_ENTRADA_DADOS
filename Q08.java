import java.util.Scanner;
public class Q08 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int diaria;
        float diariaPromo;
        float mediaMes;
        float mediaPromoMes;
        float lucro;
        System.out.println("Informe a diária normal:");
        diaria = ler.nextInt();
        diariaPromo = diaria - (diaria * 0.22f);

        System.out.println("Diária na promoção: " + diariaPromo);

        mediaMes = (diaria * 30 * 17) / 30;
        System.out.println("A média SEM a promoção foi: " + mediaMes);

        mediaPromoMes = (diariaPromo * 30 * 30) / 30;
        System.out.println("A média COM a promoção foi: " + mediaPromoMes);

        lucro = mediaPromoMes - mediaMes;
        System.out.println("O lucro/Prejuízo durante um mês foi de :" + lucro);

    }
}
