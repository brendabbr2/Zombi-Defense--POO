import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

public class Tablero {  //Mejor no la llamo GUI porque se usa mucho esa palabra

    private final JPanel gui = new JPanel(new BorderLayout(3, 3)); //Parte externa del tablero
    private JButton[][] cuadro = new JButton[8][8]; //Cada cuadro es un botón
    private JPanel terreno;                        //Panel donde ya vienen los recuadros
    private final JLabel message = new JLabel(
            "¡Defiende la base de los zombies!");
    private static final String COLS = "        ";

    Tablero() {
        initializeGui();
    }

    public final void initializeGui() {
        // Inicializar la GUI, caracteristicas generales
        gui.setBorder(new EmptyBorder(5, 5, 5, 5)); //Espacio libre en el panel de terreno
        JToolBar tools = new JToolBar();                                //Aquí vienen los botones
        tools.setFloatable(false);
        gui.add(tools, BorderLayout.PAGE_START);
        tools.add(new JButton("Items")); //Boton para ver la lista de items
        tools.add(new JButton("Atacar")); //Boton para ver la lista de items
        tools.addSeparator();
        tools.add(message);

        gui.add(new JLabel("Base"), BorderLayout.LINE_START);             //Aquí va la base a proteger

        terreno = new JPanel(new GridLayout(0, 9));           //Primera fila
        terreno.setBorder(new LineBorder(Color.BLACK));
        gui.add(terreno);

        //Aquí ya es donde se crean los cuadros del tablero
        Insets buttonMargin = new Insets(0,0,0,0);
        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro[i].length; j++) {
                JButton b = new JButton();
                b.setMargin(buttonMargin);
                // Para que el botón no quede vacío le ponemos una imagen vacía:
                ImageIcon icon = new ImageIcon(
                        new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                b.setIcon(icon);
                if ((j % 2 == 1 && i % 2 == 1)
                        || (j % 2 == 0 && i % 2 == 0)) {
                    b.setBackground(Color.lightGray);
                } else {
                    b.setBackground(Color.green);
                }
                cuadro[j][i] = b;
            }
        }

        //En caso de agregar coordenadas

        //Primera fila dentro del tablero

        //Agrega el texto escrito en la primera posicion (No hay)
        terreno.add(new JLabel(""));
        for (int ii = 0; ii < 8; ii++) {
            terreno.add(
                    new JLabel(COLS.substring(ii, ii + 1),
                            SwingConstants.CENTER));
        }

        // Primera columna dentro del tablero

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (j) {
                    case 0:     //Básicamente, si es la primera columna agrega lo escrito en texto
                        terreno.add(new JLabel("", SwingConstants.CENTER));
                    default:
                        terreno.add(cuadro[j][i]);
                }
            }
        }
    }

    public final JComponent getChessBoard() {
        return terreno;
    }

    public final JComponent getGui() {
        return gui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                Tablero cb =
                        new Tablero();

                JFrame f = new JFrame("ZOMBIES");
                f.add(cb.getGui());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                // Aquí se asegura que esté del tamaño mínimo requerido
                f.pack();
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
