/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

/**
 *
 * @author Ma'is
 */
public class W7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jam waktu = new Jam ();
        Jam waktu1 = new Jam (5, 1, 59);
        
        System.out.println(waktu.convertJamToDetikt(10));
        System.out.println(waktu.convertJamToMenit(10));
        System.out.println(waktu.convertMenitToDetik(10));
        System.out.println(waktu.convertDetikToMenit(10));
    }
    
}
