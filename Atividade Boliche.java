import java.util.Scanner;

class Main {

//Só consegui fazer funcionar ate aqui, dps tudo que eu tentava so arruinava o codigo.

  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);



    
    int[] pontuacao;
    int[] geral;
    int[] Rodada;
    int Jogada;
    int numjogada;
    int[] pinos;
    int quantrodada = 0;
    int acertados;
    int quantjogada = 0;
    int primeiro = 0;
    


    
    pinos = new int[24];
    pontuacao = new int[24];
    geral = new int[24];

    for(int i = 0; i <= 23; ++i){


      pinos[i] = 0;
      geral[i] = 1;
      pontuacao[i] = 0;


    }

    do{

      quantjogada++;

      System.out.print("Quantos pinos foram acertados na primera jogada na rodada " +(quantrodada)+ "? ");
      primeiro = entrada.nextInt();
      pinos[quantjogada]=primeiro;


        if(pinos[quantjogada]==10){
          
          geral[quantjogada] = 2;

          

        }




        if(pinos[quantjogada]<10){

      quantjogada++;

      System.out.print("Quantos pinos foram acertados na segunda jogada na rodada " +(quantrodada)+ "? ");
      pinos[quantjogada]= entrada.nextInt();

        }








      quantrodada++;

      

      



    }while (quantrodada<=9);
  

    










    }
}
