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
public class Laptop extends Perangkat {
    protected boolean webcam;
    
    public Laptop(String drive,int ram,float processor, boolean webcam){
       super(drive,ram,(float)processor);
       this.webcam = webcam;
    }

    @Override
     public void informasi(){
       System.out.print("Handphone ini memiliki drive tipe "+drive+" dengan ");
       System.out.print("ram sebesar "+ram+" GB dan ");
       System.out.print("dengan processor secepat "+processor+" Ghz. ");
       String cam = (webcam==true) ? "Selain itu laptop ini juga memiliki webcam." : "Selain itu laptop ini tidak memiliki webcam.";
       System.out.print(cam);
        System.out.println("");
    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop ini berhasil membuka game" + nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("handphone ini berhasil mengirim email ke " + email);
    }
    public void kirimEmail(String email_1,String email_2){
        System.out.println("handphone ini berhasil mengirim email ke " + email_1+" dan ke "+email_2);
    }
}
