package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //String nome = "Gustavo";
        //float nota = 9.0f;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do(a) aluno(a): ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do(a) aluno(a): ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        //System.out.format("A nota de %s é %.4f \n", nome, nota);

    }
}
