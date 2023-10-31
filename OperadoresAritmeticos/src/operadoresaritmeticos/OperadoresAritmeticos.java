package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        System.out.println();

        //Operadores Unários
        int n = 5;
        int valorn = n++;
        System.out.println(n);

        int numero = 10;
        int valor = 4 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        System.out.println();

        //Operadores de Atribuição
        int x = 4;
        x += 2; // x = x+2
        System.out.println(x);
        int y = 5;
        y *= 7; // y = y*7
        System.out.println(y);
        System.out.println();

        //Arredondamentos
        float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        System.out.println();

        //Random
        double ale = Math.random();
        int r = (int) (15 + ale * (50 - 15));
        System.out.println(r);
    }
}
