/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claxons;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Inventario {
    protected static ArrayList<MedioDeTransporte> inventario = new ArrayList<>();
        
    public Inventario() {
       inventario = new ArrayList<>();
    }
    
     public void agregarInventario(MedioDeTransporte Equipo){
            inventario.add(Equipo);
    }
}
