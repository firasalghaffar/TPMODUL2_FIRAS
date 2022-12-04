/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPMODUL2_firas;

/**
 *
 * @author ASUS
 */
public class MainApp {
    public static void main(String[] args) {
       Perangkat per = new Perangkat("Adata",2, (float) 1.80);
        System.out.println("");
       Laptop lap = new Laptop("Seagate",8,(float)2.40,true);
       Handphone hand = new Handphone("Sandisk",8,(float)2.20,true);
       per.informasi();
        System.out.println("");
       lap.informasi();
       lap.bukaGame("Dota");
       lap.kirimEmail("email1@gmail.com");
       lap.kirimEmail("email1@gmail.com","email2@gmail.com");
        System.out.println("");
       hand.informasi();
       hand.telfon(62853);
       hand.Kirimsms(62853);
       hand.Kirimsms(62853, 62854);
    }
}
