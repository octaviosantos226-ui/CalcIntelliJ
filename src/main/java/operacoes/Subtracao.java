public class Subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro valor");
        int x = scanner.nextInt();
        System.out.println("digite o segundo valor");
        int y = scanner.nextInt();
        System.out.println("o resultado é:" + (x - y));
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedir();
        System.out.println("o resultado é:" + (entradaNumeros.x - entradaNumeros.y));
    }
}