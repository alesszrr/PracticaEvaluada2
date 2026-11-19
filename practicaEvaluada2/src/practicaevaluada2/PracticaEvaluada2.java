/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada2;

import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class PracticaEvaluada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    SuperChino datos = new SuperChino("PuraVida Super", "Randy", 24544321);
    Producto productos = new Producto();
    productos.cantidadProductos();
    JOptionPane.showMessageDialog(null, datos.toString());
            
    }
    
}
