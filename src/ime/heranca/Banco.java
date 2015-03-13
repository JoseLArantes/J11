package ime.heranca;

public class Banco {
    public static void main(String [] args) throws IllegalArgumentException{
        Cliente cliente = new Cliente();
        cliente.setNome("Jose Joaquim de Moura Andrade");
        cliente.setRG("0001234");
        cliente.setNumeroCliente(9898);

        ContaCorrente conta = new ContaCorrente();
        conta.setCliente(cliente);
        conta.setNumeroConta(55555);
        conta.setContaDigito(100);
        conta.deposita(1000);
        conta.saca(2000);
        conta.ImprimeDadosCC();;
    }
}