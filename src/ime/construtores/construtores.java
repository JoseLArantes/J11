package ime.construtores;

class teste{
    private String test;

    public String getTest(){
        return this.test;
    }

    public teste(String a){
        this.test = a;
    }
}
class filha extends teste{
    public filha(String a) {
		super(a);
	}

	private int num;

    public void setNume(int n){
        this.num = n;
    }

    public int getNum(){
        return this.num;
    }

}

class roda{
    public static void main(String [] args){
        filha test = new filha("Testando");
        System.out.print(test.getTest());

    }

}
