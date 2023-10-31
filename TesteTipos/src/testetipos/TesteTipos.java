package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        /* Exemplo Int para String
        int idade = 30;
        String valor = Integer.toString(idade); */

        /* Exemplo String para Int
        String valor = "30";
        int idade = Integer.parseInt(valor);*/
        //Exemplo String para Float
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("Idade: %.3f", idade);
    }
}
