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

    public Camiones(enumGraveAgudo tipo, String sonidos, int anioFabricacion, int numSonidos) {
        super(anioFabricacion, numSonidos,sonidos);
        this.tipo = tipo;
        this.sonidos = sonidos;
        CuentaSonidos+=1;
        if(this.tipo==enumGraveAgudo.grave){
            this.sonidos="brrrroonn";
        }else if(this.tipo==enumGraveAgudo.agudo){

            this.sonidos="fiiiiiii";
        }
    }

   

    

@Override
    public String toString() {
        //MedioDeTransporte{anyoFabricacion=1999, sonidos=5}Coche{tipoClaxon=melodia}

        return super.toString()+"MedioDeTransporte{anyoFabricacion=}"+this.anioFabricacion+", sonidos="+this.numSonidos+"}Camión{Claxon="+this.tipo+"}";
    }
    
    
    
}
