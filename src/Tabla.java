import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Tabla extends JFrame{
    Object[][] data = new Object[65][5];
    public Tabla(){
        super("Consulta General");
         //Array bidimencional de objetos con los datos de la tabla
        for(int f = 0; f < 65; f++)
            for(int c = 0; c < 5; c++){
                switch(c){
                    case 0: data[f][c] = "Nombre " + (f+1); break;
                    case 1: data[f][c] = "Apellido " + (f+1); break;
                    case 2: data[f][c] = "Pasatiempo " + (f+1); break;
                    case 3: data[f][c] = (f+1); break;
                    case 4: data[f][c] = true; break;
                }
            }
        // Array de Strings con los titulos de las columnas
        String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de practica", "Soltero(a)"};
        
         //Se crea la tabla
         final JTable table = new JTable(data, columnNames);
         table.setPreferredScrollableViewportSize( new Dimension(700, 300) );
    
        //Creamos un Jsrollpane y le agregamos el JTable
        JScrollPane scrollPane = new JScrollPane(table);
    
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    
        //Manejamos la salida
        addWindowListener(
        new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Tabla frame = new Tabla();
        frame.pack();
        frame.setVisible(true);
    }
    
}
