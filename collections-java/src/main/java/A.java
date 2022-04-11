import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class A {
    public static void main(String[] args) {

        //Usando Arraylist
        ArrayList nome = new ArrayList();
        nome.add("Norivaldo");
        nome.add("João");
        nome.add("Maria");
        nome.add("Lucia");
        nome.add("Thaise");

        System.out.println("Lista Nomes - desordenada: " + nome);

        Collections.sort(nome, Collections.reverseOrder());

        System.out.println("Lista Nomes - ordenada desc: " + nome);


        //Usando LinkedList
        LinkedList profissao = new LinkedList<>();

        profissao.add("Advogado");
        profissao.add("Pintor");
        profissao.add("Gerente");
        profissao.add("Dançarino");
        profissao.add("Piloto");

        System.out.println("Lista Profissões - desordenada: " + profissao);

        Collections.sort(profissao);

        System.out.println("Lista Profissões - ordenada asc: " + profissao);













    }
}
