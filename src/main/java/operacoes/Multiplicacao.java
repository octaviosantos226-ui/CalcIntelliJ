@author info1
 */
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro valor");
        int x = scanner.nextInt();
        System.out.println("digite o segundo valor");
        int y = scanner.nextInt();
        System.out.println("o resultado é:" + (x * y));
    }
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedir();
        System.out.println("o resultado é:" + (entradaNumeros.x * entradaNumeros.y));
    }
}