package operacoes;

import java.util.Scanner;

/**
 *
 * @author info1
 */
public class EntradaNumeros {
    int x;
    int y;

    public void pedir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro valor");
        x = scanner.nextInt();
        System.out.println("digite o segundo valor");
        y = scanner.nextInt();
    }
}