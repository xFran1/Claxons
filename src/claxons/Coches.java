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
public class Coches extends MedioDeTransporte{
        private enumMelodia tipo;
        
        private static ArrayList<String> melodiaCopiada =  new ArrayList<>();

        
        
        
        public Coches(enumMelodia tipo, int anioFabricacion, int numSonidos, String sonidos) {
            super(anioFabricacion, numSonidos,sonidos);
            this.tipo = tipo;
            this.sonidos = sonidos;
            int  random = (int) (Math.random()*4)+3;
            this.numSonidos = random;
            Sonidos();

        }


    


    

    @Override
    public String toString() {
        //MedioDeTransporte{anyoFabricacion=1999, sonidos=5}Coche{tipoClaxon=melodia}

        return super.toString()+"MedioDeTransporte{anyoFabricacion=}"+this.anioFabricacion+", sonidos="+this.numSonidos+"}Coche{tipoClaxon="+this.tipo+"}";
    }


        
        public void Sonidos (){
           String[]  array=generaSonidoMelodia();
            String palabra = "";
            for(int i=0;i<array.length;i++){
                palabra=palabra+" "+array[i];
            }
            palabra = palabra.trim();

            this.sonidos=palabra;
        }
        
    
       
      
    
    public String[] generaSonidoMelodia(){
       
         CuentaSonidos+=numSonidos;
         
         String[] nuevoArraySonidos = new String[6];
         for(int i = 0 ;i<nuevoArraySonidos.length;i++){
             nuevoArraySonidos[i]=" ";
         }
         for(int i = 0;i<this.numSonidos;i++){
             int valor =(int) Math.random()*6;
             switch (valor) {
                 case 0:
                                  nuevoArraySonidos[i]="pi";

                     break;
                 case 1:
                                  nuevoArraySonidos[i]="pii";

                     break;
                 case 2:
                                  nuevoArraySonidos[i]="ri";

                     break;
                 case 3:
                                  nuevoArraySonidos[i]="rii";

                     break;
                 case 4:
                                  nuevoArraySonidos[i]="ti";

                     break;
                 case 5:
                                  nuevoArraySonidos[i]="tii";

                     break;
                 default:
                     throw new AssertionError();
             }
             
         }
         nuevoArraySonidos[0]="pii";
         nuevoArraySonidos[this.numSonidos-1]="pii";
         
         return nuevoArraySonidos;
         
    }
    
    
    public void suenaMelodia(String[]melodia){
        
        for(String name : melodia ){
            System.out.println(name+" ");
        }
    }
        
    public void copiaMelodia(String[]melodia){
    
    }

    public String getSonidos() {
        return sonidos;
    }

    public void setSonidos(String sonidos) {
        this.sonidos = sonidos;
    }
        
     
        
}
