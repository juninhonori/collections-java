import java.util.Collections;
import java.util.LinkedList;


public class B {
    public static void main(String[] args) {
        String nomedaempresa = "Microsoft";

        LinkedList <String> vetor = new LinkedList<>();

        for (int i = 0; i < nomedaempresa.length();i++){

            char guardaletra = nomedaempresa.charAt(i);
            vetor.add(String.valueOf(guardaletra).toUpperCase());
            System.out.print(guardaletra + " ");
        }

        System.out.println("");
        System.out.println("Vetor completo, sem remoção de caracteres: " + vetor);

        String removeletra = "o";

        if (vetor.contains(removeletra.toUpperCase())) {

            vetor.removeAll(Collections.singleton(removeletra.toUpperCase()));
            System.out.println("Vetor novo, com remoção de caracteres: " + vetor);

        }


    }
}
