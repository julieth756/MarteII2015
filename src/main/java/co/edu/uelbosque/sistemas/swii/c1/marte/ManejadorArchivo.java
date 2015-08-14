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
    FileReader fr;
    BufferedReader br;
    String primeraLinea;
    
    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas=new File(ruta);
        if((!reglas.exists()))
          throw new FileNotFoundException("El Archivo de Reglas No Existe");
        fr=new FileReader(reglas);
        br = new BufferedReader(fr);
    }

    public String getPrimeraLinea() throws IOException {
       primeraLinea=br.readLine();
        return primeraLinea;
    }   
    


    public Coordenada getCoordenadaInicial() throws IOException {
        if(primeraLinea==null)
            getPrimeraLinea();
        String coord[]=primeraLinea.split(" ");
        int x=Integer.parseInt(coord[0]);
        int y=Integer.parseInt(coord[1]);
        return new Coordenada(x,y);
    }

   
}
