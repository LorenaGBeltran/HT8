import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;


/**
 *
 * @author loren
 */
public class Main {

	
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File archivo = new File ("./pacientes.txt");               
        FileReader fr = new FileReader (archivo);
        String linea;
        BufferedReader br = new BufferedReader(fr);
        Vector<Paciente> pacientesEmer = new Vector<>();
        
        String nombre = "";
        String sintoma = "";
        String prioridad = "";
        boolean salir = true;Scanner teclado = new Scanner(System.in);
        int decision;
        
        while ( (linea = br.readLine()) != null)
        {      
            int pos1 = linea.indexOf(",");
            nombre = linea.substring(0, pos1);
            
            String b = linea.substring(pos1+2);
            
            int pos2 = b.indexOf(",");
            sintoma = b.substring(0, pos2);
            prioridad = b.substring(pos2+2);
            
            pacientesEmer.add(new Paciente(nombre,sintoma,prioridad));
       }
        
        String ordenados = "";
        
       VectorHeap pacientes = new VectorHeap(pacientesEmer);
       
           System.out.println("\nBienvenido a la seccion de emergencias!\n");
        
        while(salir){
        System.out.println("Ingrese la opcion que desee:\n");  
        System.out.println("1. Ver la lista de pacientes a atender en orden");
        System.out.println("2. Siguiente paciente a atender");
        System.out.println("Salir");
        decision = teclado.nextInt();      
   
        
        switch(decision){
            case 1:
                int size = pacientes.size();
                System.out.println(size);
                 for (int i = 0; i<size; i++){           
                    Paciente paciente = (Paciente) pacientes.remove();          
                    ordenados = ordenados + paciente.toString() + "\n" ;
                 }

                 System.out.println("----------------------");

                 System.out.println("Orden en que deben ser atendidos los pacientes" + "\n");

                 System.out.println(ordenados);

              
                
                break;
            case 2:
            
                String ordenados1 = " ";
                VectorHeap pacientes2 = new VectorHeap(pacientesEmer);
               
                try{
                    Paciente paciente = (Paciente) pacientes2.remove();
                    ordenados1 = ordenados1 + paciente.toString() + "\n";
                    System.out.println("----------------------");
                    System.out.println("Paciente por atender");
                    System.out.println(ordenados1);   
                    
                   
                }catch (Exception e){
                    
                    System.out.println("Ya no hay pacientes por atender");
                }                 
                
                break;
            default:
                  salir = false;
                  if (salir == false){
                    System.exit(decision);

                }
                  break;       
        }       
      }    
    }
}