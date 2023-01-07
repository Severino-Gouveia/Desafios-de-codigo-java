package teste;

import java.util.Scanner;

public class CarroTestar {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        try (Scanner scan = new Scanner(System.in)) {
            c1.nome="Uno";
            c1.marca="fiat";
            c1.ano=2015;
            c1.vel=60;

                   
                        
                   do{
                    System.out.println("quanto quer acelerar ?: ");
                    c1.acelerar(scan.nextInt());
                    System.out.println("Velocidade : " + c1.vel);

                    System.out.println("quanto quer freiar ?: ");
                    c1.freiar(scan.nextInt());
                    System.out.println("velocidade : " + c1.vel);
                   }while(c1.vel > 20);
                   c1.buzinar();
        }
          

    } 
                              
}

