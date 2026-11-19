/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada2;

import java.util.Random;

/**
 *
 * @author aless
 */
public class SuperChino {
    private String nombreLocal;
    private int codigo;
    private String empleado;
    private int cedulaEmpleado;
    
    public SuperChino() {
        Random aleatorio = new Random();
        this.codigo = aleatorio.nextInt(1000, 10000);
    }

    public SuperChino(String nombreLocal, String empleado, int cedulaEmpleado) {
        Random aleatorio = new Random();
        this.nombreLocal = nombreLocal;
        this.codigo = aleatorio.nextInt(1000,10000);
        this.empleado = empleado;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    @Override
    public String toString() {
        return "SuperChino{" + "nombreLocal=" + nombreLocal + ", codigo=" + codigo + ", empleado=" + empleado + ", cedulaEmpleado=" + cedulaEmpleado + '}';
    }
    
    
}
