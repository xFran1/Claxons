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
        private String[] arraySonidos = generaSonidoMelodia();

    public Coches(enumMelodia tipo, int anioFabricacion, int numSonidos) {
        super(anioFabricacion, numSonidos);
        this.tipo = tipo;
    }


        

        
    public int numeroSonidos(){
        int numeroSonidos = 0;
        for(String name : arraySonidos){
         numeroSonidos++;
         
        }
        return numeroSonidos;
    }
       
        @Override
    public void muestraTransporte(){
        
    }
    
    public String[] generaSonidoMelodia(){
         int numSonidos = (int) (Math.random()*4)+3;
         CuentaSonidos+=numSonidos;
         
         String[] nuevoArraySonidos = new String[numSonidos];
         for(int i = 0;i<numSonidos;i++){
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
         nuevoArraySonidos[5]="pii";
         
         return nuevoArraySonidos;
         
    }
    
    public void suenaMelodia(String[]melodia){
        
        for(String name : melodia ){
            System.out.println(name+" ");
        }
    }
        
    public void copiaMelodia(String[]melodia){
    melodiaCopiada.clear();
        for(int i =0;i<melodia.length;i++){
            melodiaCopiada.add(melodia[i]);
        }
    }
        
        public void muestraMelodiaCopiada(){
            for(String name : melodiaCopiada){
                System.out.println(name +" ");
            }
        }
        
}
