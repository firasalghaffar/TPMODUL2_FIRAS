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
public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
   public void informasi(){
       System.out.print("perangkat tidak diketahui memiliki drive tipe "+drive);
       System.out.print("dengan ram sebesar "+ram+" GB dan");
       System.out.print("processor secepat "+processor+" GHz");
   }
}
