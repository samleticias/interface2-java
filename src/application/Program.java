package application;

import services.JurosBrasilService;
import services.JurosService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor R$: ");
        double valor = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        JurosService is = new JurosBrasilService(2.0);
        double pagamento = is.pagamento(valor, meses);

        System.out.println("Pagamento após " + meses + " meses:");
        System.out.println(String.format("%.2f", pagamento));

        sc.close();

    }
}
