import java.util.Scanner;

public class Main{
    public static void main(String[]args){
    Scanner leia = new Scanner(System.in);

    System.out.println("Escreva uma fase: ");
    String fraseOriginal = leia.nextLine();
    //Tratamento da frase
    String fraseConvertida = fraseOriginal.toUpperCase().replaceAll("\\s", "");
    System.out.println(fraseConvertida);


    }
}