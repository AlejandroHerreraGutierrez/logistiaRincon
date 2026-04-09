/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logisticarincon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Alex HG
 */
public class Almacen {
    Paquete[][] paquetes = new Paquete[3][3];
    
    HashSet<String> codigos = new HashSet<>();

    @Override
    public String toString() {
        return "Almacen{" + "paquetes=" + paquetes + ", codigos=" + codigos + ", colaSalida=" + colaSalida + ", paquetesEnDestino=" + paquetesEnDestino + '}';
    }
    
    ArrayList<Paquete> colaSalida = new ArrayList<>();
    
    HashMap<String, Integer> paquetesEnDestino = new HashMap<>();
    
    public void recepcionarPaquete(Paquete p, int fila, int col) {
        if(!codigos.contains(p.codigo)) {
            System.out.println(paquetes[fila][col]);
            if (paquetes[fila][col] == null) codigos.add(p.codigo);
            paquetes[fila][col] = p;
        } else {
            System.out.println("El código ya existe en el HashSet");
        }
    }
    
    public void enviarACamion(int fila, int col) {
        Paquete paquete = paquetes[fila][col];
       // paquetes[fila][col] = null;
        
        colaSalida.add(paquete);
        
        if(paquetesEnDestino.containsKey(paquete.destino)) {
            int actual = paquetesEnDestino.get(paquete.destino);
            paquetesEnDestino.put(paquete.destino, actual + 1);
        } else {
            paquetesEnDestino.put(paquete.destino, 1);
        }
    }
    
    public void mantenimientoSeguridad(double pesoMaximo) {
        for(Paquete paquete : colaSalida) {
            if (paquete.peso > pesoMaximo) colaSalida.remove(paquete);
        }
    }
}
