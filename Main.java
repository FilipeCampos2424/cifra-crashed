import java.util.Scanner;
import java.text.Normalizer; //só pra tratar os acentos

public class Main{
    public static void main(String[]args){
    Scanner leia = new Scanner(System.in);

    System.out.println("Escreva uma frase: ");
    String fraseOriginal = leia.nextLine();
    //Tratamento da frase
    //Normalizer usado pra tratar a frase certinho
    String fraseConvertida = Normalizer.normalize(fraseOriginal, Normalizer.Form.NFD); // o NFD separa o acento da letra
    fraseConvertida = fraseConvertida.replaceAll("\\p{M}", "") //tira os acentos
    .replaceAll("[^a-zA-Z0-9]", "").toUpperCase(); //toUpperCase pra deixar tudo maiusculo
    //ele nao vai escrever nada que nao for de a-z, A-Z ou 0-9

    System.out.println(fraseConvertida);

    //n pega o tamanho da frase convertida
    int n = fraseConvertida.length();
    //o indice que vai fazer os saltos
    int indice = 0;
    //vetor resultado que guarda o tamanho da frase em caracteres
    char resultado[] = new char[n];
    
    //for para percorrer o vetor
    for (int i = 0; i < n; i++) {
        //o vetor em for vira igual a frase em char de acordo com o indice
        resultado[i] = fraseConvertida.charAt(indice);
        //o indice que faz os saltos até o tamanho da string
        indice = (indice + 5) % n;
    }
    String cifrada = new String(resultado);
    System.out.println("Cifrada: "+ cifrada);

    char original[] = new char[n];
    indice = 0;

    for (int i = 0; i < n; i++) {
        original[indice] = cifrada.charAt(i); //pega o char da cifra (i) e coloca na posição correta (indice)
        indice = (indice + 5) % n; 
    }

    String decifrada = new String(original);
    System.out.println("Decifrada: "+ decifrada);


    }
}