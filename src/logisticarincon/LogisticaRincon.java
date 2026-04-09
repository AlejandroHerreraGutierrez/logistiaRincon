/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logisticarincon;

/**
 *
 * @author Alex HG
 */
public class LogisticaRincon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacen almacen1 = new Almacen();
        
        Paquete paquete1 = new Paquete("1234", 5.43, "Barcelona");
        Paquete paquete2 = new Paquete("5482", 8.91, "Barcelona");
        Paquete paquete3 = new Paquete("1235", 2.61, "Madrid");
        Paquete paquete4 = new Paquete("9999", 7.25, "Vecindario");
        
        almacen1.recepcionarPaquete(paquete1, 1, 0);
        almacen1.recepcionarPaquete(paquete2, 1, 1);
        almacen1.recepcionarPaquete(paquete3, 1, 2);
        almacen1.recepcionarPaquete(paquete4, 2, 0);
        almacen1.toString();
        
        almacen1.enviarACamion(1, 1);
        almacen1.enviarACamion(2, 0);
        almacen1.enviarACamion(1, 2);
        almacen1.enviarACamion(1, 0);
        
        almacen1.mantenimientoSeguridad(7.5);
        
        System.out.println(almacen1.toString());
        
        
    }
    
}
