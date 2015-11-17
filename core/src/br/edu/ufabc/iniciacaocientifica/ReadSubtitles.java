package br.edu.ufabc.iniciacaocientifica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ReadSubtitles {
	
	public ReadSubtitles(){
		String path     = "C:\\Users\\Alan\\Documents\\NetBeansProjects\\Projeto\\BandaDoMarMaisNinguem.txt";
		try{
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linha;
            String finals ="";
            int i=0;
            //Lê a primeira linha para reconhecer quantas estrofes e tempo a musica tem
            while (i<1) {
                linha = buffRead.readLine();
                if (linha != null) {
                    finals += linha;
                } else break;
                i++;
            }
            String[] s = finals.split(" ");
            Random m = new Random();
            //Pega uma estrofe aleatoriamente da musica
            int w = m.nextInt(Integer.parseInt(s[3]));
            w++;
            System.out.println( w );
            //Define condicao de entrada e saida da Estrofe
            String stp = "E="+ String.valueOf(w);
            String stp2 = "--";
            finals="";
            while (true) {
                linha = buffRead.readLine();
                if (linha.equals(stp)) {
                    linha = buffRead.readLine();
                    while(!linha.equals(stp2)){
                        System.out.println( linha );
                          finals += linha + "\n";
                          linha = buffRead.readLine();
                  }
                  break;
                }             
            }
            String[] text = finals.split(" ");
            //escolhe tres palavras da estrofe PRECISA MELHORAR ISSO
            int p = m.nextInt(text.length);
            int q = m.nextInt(text.length);
            int r = m.nextInt(text.length);
            String L = "";
            for(int j=0;j<text.length;j++){
                if(j==p||j==q ||j==r){
                    System.out.println( text[j] );
                    L= L+ "******"+ " ";
                }else{
                    L= L+text[j]+" ";
                }
            }
            System.out.println( p+" "+q+" "+r );
            int[] v = {p,q,r,3,5};
            int k;
            for(i =0;i<5;i++){
                k = m.nextInt(5);
                switch(i){
                    case 0:
                        System.out.println(k);
                        break;
                    case 1:
                        System.out.println(k);
                        break;
                    case 2:
                        System.out.println(k);
                        break;
                    case 3:
                        System.out.println(k);
                        break;
                    case 4:
                        System.out.println(k);
                        break;
                }
            }
            buffRead.close();
        }catch(IOException e){

        }
	}
}
    
  