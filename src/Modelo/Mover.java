package Modelo;



import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Mover extends Thread {
    public datocarro datoscarros;

    int posicionIinicialX, limite, velocidad;
    JLabel lblAux;

    public Mover(int posicionIinicialX, int limite, JLabel lblAux, int velocidad) {
        this.posicionIinicialX = posicionIinicialX;
        this.limite = limite;
        this.lblAux = lblAux;
        this.velocidad = velocidad;
        this.datoscarros = new datocarro();

    }
    

    public void run() {
long t1= System.currentTimeMillis();
long t2 = 0;
        for (int i = this.limite; i > 0; i--) {
         t2 = System.currentTimeMillis();
            this.lblAux.setBounds(posicionIinicialX, i, 80, 110);
            try{
            
            sleep(velocidad);
            } catch (Exception e) { };

        }
        datocarro aux = new datocarro();
        
        double tiempo =  ((t2-t1)/1000.0);
        
        this.datoscarros.setNombre(this.lblAux.getName());
        this.datoscarros.setTiempo(tiempo);
        
        //System.out.println("Termino: "+ this.lblAux.getName());
        System.out.println("Termino: " + this.lblAux.getName() +" "+ ((t2-t1)/1000.0)+ " segundos");
        //JOptionPane.showMessageDialog(null, "Termino" +this.lblAux.getName());
    }

}
