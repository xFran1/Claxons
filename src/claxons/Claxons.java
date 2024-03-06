/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claxons;

/**
 *
 * @author Fran
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Claxons {

  
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    MedioDeTransporte[] array = new MedioDeTransporte[6];
    ArrayList<String> Melodia = new ArrayList<>();
    boolean salir = false;
    int opcion = 0 ;
    int anioFabricacion = 0;
    int contador = 0;
     for(int i = 0;i<array.length;i++){
    array[i]=new MedioDeTransporte();
     }
    do{
        System.out.println("1.Fabrica coche.\n2.Fabrica camión.\n3.Cuenta sonidos.\n4.Muestra todos los medios de transporte.\n5.Vehiculo copiado.\n6.Salir");
         opcion = s.nextInt();
         
        switch (opcion) {
            case 1:
                System.out.print("Escriba año de fabricación:");
                anioFabricacion=s.nextInt();
                s.nextLine();
                        
               // array[contador]=(new Coches(enumMelodia.melodia, ,anioFabricacion, 0));
                array[contador]=new Coches(enumMelodia.melodia, anioFabricacion, 0, " ");
                contador++;
                break;
            case 2:
                System.out.print("Escriba año de fabricación:");
                anioFabricacion=s.nextInt();
                System.out.println("Elija si es un claxón 1.agudo o 2.grave");
                int respuesta = s.nextInt();
                
                if(respuesta == 1){
                //array[contador]=(new Camiones(enumGraveAgudo.agudo, anioFabricacion, 0));
                    array[contador]=new Camiones(enumGraveAgudo.agudo, " ", anioFabricacion, 1);
                }else {
               // array[contador]=(new Camiones(enumGraveAgudo.grave, anioFabricacion, 0));
                    array[contador]=new Camiones(enumGraveAgudo.grave, " ", anioFabricacion, 1);
                }
                contador++;
                break;
            case 3:
                System.out.println("El número de sonidos de todos los cláxones es de: "+MedioDeTransporte.getCuentaSonidos());
                break;
            case 4:
                for(int i = 0;i<array.length;i++){
                    System.out.println(array[i].toString()); 
                }
                //comentarios
                break;
            case 5:
                Melodia.clear();
                 for(int i = 0;i<array.length;i++){
                    Melodia.add(array[i].getSonidos());
                }
                 
                 System.out.println("Mostrando todas las melodias: ");
                 for(String name: Melodia){
                     if(name!=null){
                                              System.out.println(name);

                     }
                 }
                break;
                
            case 6:
                System.out.println("Gracias por usar esta aplicación");
                salir = true;
               
                break;
            default:
                throw new AssertionError();
        }
    
        
    }while(!salir);
        
    }
    
}
