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
public class MedioDeTransporte implements SonidoDeClaxon {
       protected final int anioFabricacion ;
       protected static int CuentaSonidos;
       protected int numSonidos;
       protected String sonidos;

       public static ArrayList<MedioDeTransporte> arrayTransportes = new ArrayList<>();

    public MedioDeTransporte(int anioFabricacion, int numSonidos, String sonidos) {
        this.anioFabricacion = anioFabricacion;
        this.numSonidos = numSonidos;
        this.sonidos = sonidos;
    }

    

    public MedioDeTransporte() {
           this.anioFabricacion = 0;
    }

    


    public static int getCuentaSonidos() {
        return CuentaSonidos;
    }

    public static void setCuentaSonidos(int CuentaSonidos) {
        MedioDeTransporte.CuentaSonidos = CuentaSonidos;
    }

    @Override
    public String[] generaSonidosMelodia() {
        return null; }

    @Override
    public void suenaMelodia(String[] melodia) {

    }

    @Override
    public String toString() {
        return " ";
    }

    public String getSonidos() {
        return sonidos;
    }

    public void setSonidos(String sonidos) {
        this.sonidos = sonidos;
    }
    
    
    
    
    
        
        
}
