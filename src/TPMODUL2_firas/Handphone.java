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
public class Handphone extends Perangkat{
    protected boolean fingerprint;
    
    public Handphone(String drive,int ram,float processor, boolean fingerprint){
       super(drive,ram,(float)processor);
       this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
       System.out.print("Handphone ini memiliki drive tipe "+drive+" dengan ");
       System.out.print("ram sebesar "+ram+" GB dan ");
       System.out.print("dengan processor secepat "+processor+" Ghz. ");
       String finger = (fingerprint==true) ? "Selain itu handphone ini juga memiliki fingerprint." : "Selain itu handphone ini tidak memiliki fingerprint.";
       System.out.print(finger);
        System.out.println("");
    }
    public void telfon(int nomer){
        System.out.println("handphone ini berhasil menelpon ke No " + nomer);
    }
    public void Kirimsms(int nomer){
        System.out.println("handphone ini berhasil mengirim sms ke No " + nomer);
    }
    public void Kirimsms(int nomer_1,int nomer_2){
        System.out.println("handphone ini berhasil mengirim sms ke No " + nomer_1+" dan ke No "+nomer_2);
    }
}
