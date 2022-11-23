package coincidenciasarn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa para la búsqueda de cadenas de ARN iguales en un archivo TXT proporcionado. 
 * Las cadenas tienen que estar en diferentes líneas dentro del TXT 
 * En este programa voy a crear el archivo TXT y llenarlo con 12 letras seleccionadas aleatoriamente de entre las letras A, C, G y U
 * Es un programa que pidió un compañero de clase y me gustó mucho como para practicar
 *
 * 
 * @author Lucas
 */
public class CoincidenciasARN {
    
    
    
    
    public void crearYllenarTXT() {
        
         String letrasPermitidas[] = {"A", "C", "G", "U"};
         String ARN = "", escribir = "";
         
         
         try {
            String ruta = "Cadena de ARN.txt";
            File file = new File(ruta);
            if(!file.exists()){
                file.createNewFile();
            }
             FileWriter fw = new FileWriter(file);
             try (BufferedWriter bw = new BufferedWriter(fw)) {
                 for(int i=0; i<10; i++){
                     for(int x=0; x<12; x++) {
                         ARN += letrasPermitidas[(int) Math.floor(Math.random()*3)];
                     }
                     ARN += "\n";
                     escribir = ARN;
                 }
                 bw.write(escribir);
             }
            
            
        } catch (IOException e) {
        }
        
        
    }
    
    
   
    

    
    public static void main(String[] args) {
        CoincidenciasARN arn = new CoincidenciasARN();
        arn.crearYllenarTXT();
        
    }
    
}
