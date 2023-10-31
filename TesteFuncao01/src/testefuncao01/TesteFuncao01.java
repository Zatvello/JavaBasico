package testefuncao01;

public class TesteFuncao01 {

    static int soma (int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int s = soma(5, 2);
        System.out.println("A soma vale: " + s);
    }
}
