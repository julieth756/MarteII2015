/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class ManejadorArchivo {
    
    private File reglas;
    
    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas=new File(ruta);
        if((!reglas.exists()))
          throw new FileNotFoundException("El Archivo de Reglas No Existe");
    }

    public String getPrimeraLinea() throws IOException {
        FileReader fr=new FileReader(reglas);
        BufferedReader br = new BufferedReader(fr);
        return br.readLine();
    }   
    
    public int getCoordenadasX(String linea){
        String dato1 = null;
        if(linea ==null){
            System.out.print("7");
        }else{
        for (int x=0; x<linea.length();x++){
          if (linea.charAt(x)!=' '){
              dato1 += linea.charAt(x);
          }
        }        
        }
        int coordX = Integer.parseInt(dato1);
        return coordX;
    }
  
    public int getCoordenadasY(String linea){
        String dato2 = null;
        if(linea ==null){
            System.out.print("6");
        }else{
        for (int x=0; x<linea.length();x++){
          if (linea.charAt(x)==' '){ 
             for (int y=x; y<linea.length();y++){
                 if (linea.charAt(y)!=' '){
                 dato2 += linea.charAt(y);
                 }
               }
           }
        }
        }
        int coordY = Integer.parseInt(dato2);
        return coordY;
    }
}
