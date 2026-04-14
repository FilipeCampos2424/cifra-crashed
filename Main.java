import java.util.Scanner;


public class Main{
    public static void main(String[]args){
    Scanner leia = new Scanner(System.in);

    System.out.println("Escreva uma frase: ");
    String fraseOriginal = leia.nextLine();
    //Tratamento da frase
    String fraseConvertida = fraseOriginal.toLowerCase()
    .replace("à", "a").replace("â", "a").replace("ã", "a")
    .replace("é", "e").replace("ê", "e")
    .replace("í", "i")
    .replace("ó", "o").replace("ô", "o").replace("õ", "o")
    .replace("ú", "u")
    .replace("ç", "c")
    .replaceAll("[^a-z0-9]", "") // esse aqui remove tudo que não for letra ou número
    .toUpperCase(); 


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