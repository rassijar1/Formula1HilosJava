/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Mover;
import Modelo.datocarro;
import Vista.Formula1;
import Vista.TablaResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc Smart
 */
public class Controlador implements ActionListener {

    private int cant = 0;
    private final Formula1 formulario;
    private final TablaResultados formu;
    private Mover hiloauto1, hiloauto2, hiloauto3, hiloauto4, hiloauto5;

    public Controlador() {
        formulario = new Formula1();
        formu = new TablaResultados();
        formulario.getBtniniciar().addActionListener(this);
        formulario.getBtncarro3().addActionListener(this);
        formulario.getBtncarro4().addActionListener(this);
        formulario.getBtncarro5().addActionListener(this);
        //formu.getjTable1().addActionListener(this);
        formulario.getBtnResultados().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int intAleatorio = (int) (Math.random() * 10);

        if (e.getSource() == formulario.getBtniniciar()) {
            cant = 3;
            hiloauto1 = new Mover(50, 550, formulario.getLblcarro1(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto2 = new Mover(180, 550, formulario.getLblcarro2(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto3 = new Mover(325, 550, formulario.getLblcarro3(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            formulario.auto3();
            hiloauto1.start();
            hiloauto2.start();
            hiloauto3.start();

        }
        if (e.getSource() == formulario.getBtncarro3()) {
            cant = 2;
            hiloauto1 = new Mover(50, 550, formulario.getLblcarro1(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto2 = new Mover(180, 550, formulario.getLblcarro2(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            formulario.auto2();
            hiloauto1.start();
            hiloauto2.start();
        }

        if (e.getSource() == formulario.getBtncarro4()) {
            cant = 4;
            hiloauto1 = new Mover(50, 550, formulario.getLblcarro1(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto2 = new Mover(180, 550, formulario.getLblcarro2(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto3 = new Mover(325, 550, formulario.getLblcarro3(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto4 = new Mover(470, 550, formulario.getLblcarro4(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            formulario.auto4();
            hiloauto1.start();
            hiloauto2.start();
            hiloauto3.start();
            hiloauto4.start();
        }
        if (e.getSource() == formulario.getBtncarro5()) {
            cant = 5;
            hiloauto1 = new Mover(50, 550, formulario.getLblcarro1(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto2 = new Mover(180, 550, formulario.getLblcarro2(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto3 = new Mover(320, 550, formulario.getLblcarro3(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto4 = new Mover(470, 550, formulario.getLblcarro4(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            hiloauto5 = new Mover(610, 550, formulario.getLblcarro5(), intAleatorio);
            intAleatorio = (int) (Math.random() * 10);
            formulario.auto5();
            hiloauto1.start();
            hiloauto2.start();
            hiloauto3.start();
            hiloauto4.start();
            hiloauto5.start();
        }

        if (e.getSource() == formulario.getBtnResultados()) {
            ArrayList<datocarro> cargar = new ArrayList<>();
            if (cant == 2) {
                if (this.hiloauto1.datoscarros != null) {
                    cargar.add(this.hiloauto1.datoscarros);
                }
                if (this.hiloauto2.datoscarros != null) {
                    cargar.add(this.hiloauto2.datoscarros);
                }
            }
            if (cant == 3) {
                if (this.hiloauto1.datoscarros != null) {
                    cargar.add(this.hiloauto1.datoscarros);
                }
                if (this.hiloauto2.datoscarros != null) {
                    cargar.add(this.hiloauto2.datoscarros);
                }
                if (this.hiloauto3.datoscarros != null) {
                    cargar.add(this.hiloauto3.datoscarros);
                }
            }
            if (cant == 4) {
                if (this.hiloauto1.datoscarros != null) {
                    cargar.add(this.hiloauto1.datoscarros);
                }
                if (this.hiloauto2.datoscarros != null) {
                    cargar.add(this.hiloauto2.datoscarros);
                }
                if (this.hiloauto3.datoscarros != null) {
                    cargar.add(this.hiloauto3.datoscarros);
                }
                if (this.hiloauto4.datoscarros != null) {
                    cargar.add(this.hiloauto4.datoscarros);
                }
            }
            if (cant == 5) {
                if (this.hiloauto1.datoscarros != null) {
                    cargar.add(this.hiloauto1.datoscarros);
                }
                if (this.hiloauto2.datoscarros != null) {
                    cargar.add(this.hiloauto2.datoscarros);
                }
                if (this.hiloauto3.datoscarros != null) {
                    cargar.add(this.hiloauto3.datoscarros);
                }
                if (this.hiloauto4.datoscarros != null) {
                    cargar.add(this.hiloauto4.datoscarros);
                }
                if (this.hiloauto5.datoscarros != null) {
                    cargar.add(this.hiloauto5.datoscarros);
                }
            }
            
            this.cargartabla(this.burbuja(cargar));
            this.formu.setVisible(true);
        }
    }

    public void cargartabla(ArrayList<datocarro> carros) {

        DefaultTableModel m = new DefaultTableModel();
        m.addColumn(" Posicion ");
        m.addColumn(" carro ");
        m.addColumn("tiempo");
        String[] aux = new String[3];

        for (datocarro df : carros) {
            m.addRow(new Object[]{
                df.getPosicion(), df.getNombre(), df.getTiempo()
            });

        }
        this.formu.getjTable1().setModel(m);
        
    }
    public ArrayList<datocarro> burbuja(ArrayList<datocarro> lista){
        datocarro temp;
        for(int i=1;i < lista.size();i++){
            for (int j=0 ; j < lista.size()- 1; j++){
                if (lista.get(j).getTiempo() > lista.get(j+1).getTiempo()){
                    temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    
                    lista.set(j+1, temp);
                }
            }
        }
        for(int i=0;i < lista.size();i++){
            lista.get(i).setPosicion(i+1);
        }
    return lista;
    }

}

//}

//}
//}

