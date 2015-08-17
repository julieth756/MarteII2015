/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author jcobos
 */
public class PosicionE {
    int x1;
    int y1;
    String s1;
    
    public PosicionE(int x1, int y1, String s1) {
        this.x1=x1;
        this.y1=y1;
        this.s1=s1;
    }
    
    @Override
     public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Coordenada)) return false;
        PosicionE tmp = (PosicionE)obj;
        return (this.x1==tmp.x1 && this.y1==tmp.y1 && this.s1 == tmp.s1);
    }

}
