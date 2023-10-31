package horadosistema;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen_size = toolkit.getScreenSize();

        System.out.print("Sua tela tem resolução: ");
        System.out.print(screen_size.width);
        System.out.print("x");
        System.out.println(screen_size.height);

    }
}
