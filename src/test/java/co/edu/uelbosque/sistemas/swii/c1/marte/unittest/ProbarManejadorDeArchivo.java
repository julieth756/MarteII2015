/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.Coordenada;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import co.edu.uelbosque.sistemas.swii.c1.marte.PosicionE;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProbarManejadorDeArchivo {
    
    @Test(expectedExceptions = FileNotFoundException.class)
    public void elArchivoNoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("reglas.txt");
    }
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
    }
    
    @Test
    public void laPrimerLineaDelArchivoEsCorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String linea = manejador.getPrimeraLinea();
        String lineaUnoEsperada="7 6";
        Assert.assertEquals(linea,lineaUnoEsperada);
        
    }
    
    @Test
    public void laCoordenadaInicialEsCorrecta() throws FileNotFoundException, IOException{
        Coordenada c=new Coordenada(7,6);
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada esperada=manejador.getCoordenadaInicial();
        Assert.assertEquals(c,esperada);
    }
    
    @Test
    public void crearTablero() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");    
        Tablero t=new Tablero();
        t.crearTablero();
    }
    
    @Test
    public void laSegundaLineaEsCorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String linea = manejador.getSegundaLinea();
        String lineaDosEsperada = "1 2 N";
        Assert.assertEquals(linea,lineaDosEsperada);
    }
    
    @Test
    public void laPosicionInicialDelExploradorEsCorrecta() throws FileNotFoundException, IOException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        PosicionE posE = new PosicionE(1,2,"N");
        PosicionE esperadaE = manejador.getPosicionInicialExplorador();
        Assert.assertEquals(posE, esperadaE);
    }
}
