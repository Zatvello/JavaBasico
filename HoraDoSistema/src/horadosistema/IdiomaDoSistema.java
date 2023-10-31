package horadosistema;

import java.util.Date;
import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("Seu sistema está em: ");
        System.out.println(idioma);
    }
}
