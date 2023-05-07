/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Pc Smart
 */
public class Formula1 extends javax.swing.JFrame {

    private JLabel lblpista, lblcarro1, lblcarro2, lblcarro3, lblcarro4, lblcarro5;
    private JButton btniniciar, btncarro3, btncarro4, btncarro5;
    private JButton btnResultados;
    

    public JButton getBtncarro3() {
        return btncarro3;
    }

    public JButton getBtncarro4() {
        return btncarro4;
    }

    public JLabel getLblcarro4() {
        return lblcarro4;
    }

    public JLabel getLblcarro5() {
        return lblcarro5;
    }

    public JButton getBtncarro5() {
        return btncarro5;
    }

    public JLabel getLblpista() {
        return lblpista;
    }

    public JLabel getLblcarro1() {
        return lblcarro1;
    }

    public JLabel getLblcarro2() {
        return lblcarro2;
    }

    public JLabel getLblcarro3() {
        return lblcarro3;
    }

    public JButton getBtniniciar() {
        return btniniciar;
    }

  public Formula1(JButton btnResultados) {
        this.btnResultados = btnResultados;
    }

    public JButton getBtnResultados() {
        return btnResultados;
    }

    //nt alto = 700;
    public Formula1() {
        initComponents();
        setTitle("formula 1 con hilos");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        lblpista = new JLabel();
        this.getContentPane().add(this.lblpista);
        this.lblpista.setIcon(new ImageIcon(getClass().getResource("pista5carriles.gif")));
        this.lblpista.setBounds(100, 0, 700, 650);

        this.lblcarro1 = new JLabel();
        //this.lblpista.add(this.lblcarro1);
        this.lblcarro1.setIcon(new ImageIcon(getClass().getResource("carro1.jpg")));
        this.lblcarro1.setBounds(50, 550, 80, 110);
        this.lblcarro1.setName("Auto 1");

        this.lblcarro2 = new JLabel();
        //this.lblpista.add(this.lblcarro2);
        this.lblcarro2.setIcon(new ImageIcon(getClass().getResource("carro2.jpg")));
        this.lblcarro2.setBounds(180, 550, 80, 110);
        this.lblcarro2.setName("Auto 2");
        
        this.lblcarro3 = new JLabel();
        //this.lblpista.add(this.lblcarro3);
        this.lblcarro3.setIcon(new ImageIcon(getClass().getResource("carro3.jpg")));
        this.lblcarro3.setBounds(325, 550, 80, 110);
        this.lblcarro3.setName("Auto 3");
        
        this.lblcarro4 = new JLabel();
        //this.lblpista.add(this.lblcarro4);
        this.lblcarro4.setIcon(new ImageIcon(getClass().getResource("carro4.jpg")));
        this.lblcarro4.setBounds(470, 550, 80, 110);
        this.lblcarro4.setName("Auto 4");
        
        this.lblcarro5 = new JLabel();
        //this.lblpista.add(this.lblcarro5);
        this.lblcarro5.setIcon(new ImageIcon(getClass().getResource("carro5.jpg")));
        this.lblcarro5.setBounds(610, 550, 80, 110);
        this.lblcarro5.setName("Auto 5");

        btniniciar = new JButton("3 autos");
        this.getContentPane().add(btniniciar);
        this.btniniciar.setBounds(10, 80, 80, 50);

        btncarro3 = new JButton("2 autos");
        this.getContentPane().add(btncarro3);
        this.btncarro3.setBounds(10, 10, 80, 50);

        btncarro4 = new JButton("4 autos");
        this.getContentPane().add(btncarro4);
        this.btncarro4.setBounds(10, 150, 80, 50);

        btncarro5 = new JButton("5 autos");
        this.getContentPane().add(btncarro5);
        this.btncarro5.setBounds(10, 230, 80, 50);

        btnResultados = new JButton("Resultados");
        this.getContentPane().add(btnResultados);
        this.btnResultados.setBounds(10, 300, 80, 50);
    }

    public void auto2() {
        this.lblpista.add(this.lblcarro1);
        this.lblpista.add(this.lblcarro2);
        this.lblpista.remove(this.lblcarro3);
        this.lblpista.remove(this.lblcarro4);
        this.lblpista.remove(this.lblcarro5);

    }

    public void auto3() {
        this.lblpista.add(this.lblcarro1);
        this.lblpista.add(this.lblcarro2);
        this.lblpista.add(this.lblcarro3);
        this.lblpista.remove(this.lblcarro4);
        this.lblpista.remove(this.lblcarro5);

    }

    public void auto4() {
        this.lblpista.add(this.lblcarro1);
        this.lblpista.add(this.lblcarro2);
        this.lblpista.add(this.lblcarro3);
        this.lblpista.add(this.lblcarro4);
        this.lblpista.remove(this.lblcarro5); 
    }

    public void auto5() {
        this.lblpista.add(this.lblcarro1);
        this.lblpista.add(this.lblcarro2);
        this.lblpista.add(this.lblcarro3);
        this.lblpista.add(this.lblcarro4);
        this.lblpista.add(this.lblcarro5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formula1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formula1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formula1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formula1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formula1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
