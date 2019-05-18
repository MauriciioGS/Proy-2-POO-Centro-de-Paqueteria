/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalconinterfaz;
import javax.swing.JLabel;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author hp
 */
public class Reloj extends Thread{
    private JLabel lbl;
    
    public Reloj (JLabel lbl){
        this.lbl=lbl;
    }
    @Override
    public void run(){
        while(true){
            Date a= new Date();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
            lbl.setText(s.format(a));
        try{
            sleep(1000);
            
        }catch(Exception e){
            e.printStackTrace();;
        }  
            
        }
    }
    
}
