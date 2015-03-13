package br.caelum.ed.vetores;

public class testeArray {
    public static void main(String [] args){
       int[] v = new int[15];
       System.out.println("0"+" ");
        for (int x=1;x<v.length;x++){
           if (x <= 2){
        	   v[x] = 1;
        	   System.out.println("1"+" ");
            }else{
            	v[x] = v[x-1]+v[x-2];
           System.out.println(v[x]+" ");
	        }
        }
    }
	
}
