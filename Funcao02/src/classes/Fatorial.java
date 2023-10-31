package classes;

public class Fatorial {

    private int num = 0;
    private int fat = 1;
    private String formula = "";
    private String calcR = "";

    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        String calc = "";

        for (int c = n; c > 1; c--) {
            f = f * c;
            s += c + " x ";

            calc = calc + " = " + "(" + f + ")";
        }

        s += "1 = ";
        fat = f;
        formula = s;
        calcR = calc;
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }

    public String getCalcR() {
        return calcR;
    }
}
