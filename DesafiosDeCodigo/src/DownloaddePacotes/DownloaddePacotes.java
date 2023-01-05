package DownloaddePacotes;
import java.util.Objects;
import java.util.Scanner; 

public class DownloaddePacotes {
     
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int tamanho = Scan.nextInt();

        StringBuffer progBuffer = new StringBuffer();

        if (Objects.nonNull(tamanho)){
            for (int i =0 ; i < tamanho; i ++)
    {
            progBuffer.append("/");
            }
            System.out.println(progBuffer);
        }
    }   
}
