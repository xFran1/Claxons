/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claxons;

/**
 *
 * @author Fran
 */
import java.util.Scanner;
public class Claxons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean salir = false;
    int opcion = 0 ;
    int anioFabricacion = 0;
    Inventario inventario1= new Inventario();
    
    do{
        System.out.println("1.Fabrica coche.\n2.Fabrica camión.\3.Cuenta sonidos.\4.Muestra todos los medios de transporte.\5.Vehiculo copiado.\6.Salir");
         opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Escriba año de fabricación:");
                anioFabricacion=s.nextInt();
                inventario1.agregarInventario(new Coches(enumMelodia.melodia, anioFabricacion, 0));
                break;
            case 2:
                System.out.print("Escriba año de fabricación:");
                anioFabricacion=s.nextInt();
                System.out.println("Elija si es un claxón");
                inventario1.agregarInventario(new Camiones(enumGraveAgudo.agudo, anioFabricacion, 0));
                break;
            case 3:
                System.out.println("El número de sonidos de todos los cláxones es de: "+MedioDeTransporte.getCuentaSonidos());
                break;
            case 4:
                
                break;
            case 5:
                
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
