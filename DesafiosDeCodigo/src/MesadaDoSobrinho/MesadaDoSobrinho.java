package MesadaDoSobrinho;

import java.util.Scanner;

public class MesadaDoSobrinho{
    public static void main(String[] args) {
      
        try (Scanner Scan = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de meses :");
            int entrada = Scan.nextInt();
            int mesada = 50;
            int total = mesada*entrada;
            System.out.println("Você irá acumular:"+  total + " Reais");
        }
    }
}