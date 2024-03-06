/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claxons;

/**
 *
 * @author Fran
 */
public class Camiones extends MedioDeTransporte{
    private enumGraveAgudo tipo ;

    public Camiones(enumGraveAgudo tipo, int anioFabricacion, int numSonidos) {
        super(anioFabricacion, numSonidos);
        this.tipo = tipo;
    }

    

 @Override
    public void muestraTransporte(){
        
    }    
    
    
    
}
