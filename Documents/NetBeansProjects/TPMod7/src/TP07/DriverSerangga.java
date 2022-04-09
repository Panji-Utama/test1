/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP07;

/**
 *
 * @author Panji
 */
public class DriverSerangga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Serangga serangga;
        Koordinat koor = new Koordinat(20,30);
        Koordinat3D koor3D = new Koordinat3D(40,50,80);
        
        serangga = new Semut("Merah", koor);
        serangga.info();
        serangga.gerak(new Koordinat(50,60));
        serangga.info();
        
        serangga = new Lebah("Kuning", koor3D);
        serangga.info();
        serangga.gerak(new Koordinat3D(120,130,180));
        serangga.info();
    }
    
}
