public class App {
    public static void main(String[] args) throws Exception {
        Cliente venilton = new Cliente("Venilton");

        IConta cc = new ContaCorrente(venilton);

        cc.depositar(100);
        cc.imprimirExtrato();

        cc.sacar(150);
    }
}
