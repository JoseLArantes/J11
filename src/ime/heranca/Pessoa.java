package ime.heranca;

abstract class Pessoa{
    private String nome;
    private String rg;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setRG(String rg){
        this.rg = rg;
    }
    public String getRG(){
        return this.rg;
    }  
}