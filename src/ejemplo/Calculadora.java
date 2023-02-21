/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    private int a;
    private int b;
    
    /**
     * 
     * @param a Operador 1
     * @param b Operaor 2
     */

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    /**
     * 
     * @return Resultado de la suma 
     */

    public int sumar() {
        return a + b;
    }
    
    /**
     * 
     * @return Resultado de la resta 
     */
    
    public int resta() {
        return a - b;
    }
}
