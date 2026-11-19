/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class Producto {
    private int codigo;
    private String producto;
    private String tipo;
    private double precio;
    private int cantidad = 0;
    private double productoBruto = 0;
    private double ganancia = 0;

    public Producto() {
        Random aleatorio = new Random();
        this.codigo = aleatorio.nextInt(1000, 10000);
    }
        
    public Producto(String producto, String tipo, double precio) {
        Random aleatorio = new Random();
        this.codigo = aleatorio.nextInt(1000,10000);
        this.producto = producto;
        this.tipo = tipo;
        this.precio = precio;
    }
        
    public void cantidadProductos(){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuántos productos desea ingresar?"));
        Producto productos[] = new Producto[cantidad];
        llenarProductos(productos);
    }
    
    public void llenarProductos(Producto productos[]){
        for (int i = 0; i < productos.length; i++) {
            producto = JOptionPane.showInputDialog("Nombre del producto.");
            tipo = JOptionPane.showInputDialog("Tipo de producto? (Alimento / Bebida / Higiene / Limpieza)");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto?"));
            productos[i] = new Producto(producto, tipo, precio);
        }
        imprimir(productos);
    }
    
    public String imprimir(Producto productos[]) {
        String resultado = "";
        for (int i = 0; i < productos.length; i++) {
            resultado = productos[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
        return resultado;
    }
    
    public double precios(Producto productos[]){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].producto.equalsIgnoreCase("Alimento")){
                productoBruto += ((productos[i].precio)*0.20) + productos[i].precio;
                ganancia = (productoBruto - productos[i].precio)* cantidad;
            }
            if (productos[i].producto.equalsIgnoreCase("Bebida")){
                productoBruto += ((productos[i].precio)*0.30) + productos[i].precio;
                ganancia = (productoBruto - productos[i].precio)* cantidad;
            }          
            if (productos[i].producto.equalsIgnoreCase("Higiene")){
                productoBruto += ((productos[i].precio)*0.25) + productos[i].precio + (500);  
                ganancia = (productoBruto - productos[i].precio)* cantidad;
            }
            if (productos[i].producto.equalsIgnoreCase("Limpieza")){
                productoBruto += ((productos[i].precio)*0.23) + productos[i].precio + (1000); 
                ganancia = (productoBruto - productos[i].precio)* cantidad;
            }             
        }
        return ganancia; 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", producto=" + producto + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    
    
}
