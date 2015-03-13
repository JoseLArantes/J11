package ime.heranca;

public class ContaPoupanca extends Conta{
    private String aniversario;

    public void setAniversario(String aniv){
        this.aniversario = aniv;
    }
    public String getAniversario(){
        return this.aniversario;
    }

    public void deposita(double valor){
        super.deposita(valor+1);
        System.out.println("Rendimento de depósito: R$1,00");
    }
}