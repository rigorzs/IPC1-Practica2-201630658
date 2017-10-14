/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_gameoflife;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Juan RigobertoZuñiga
 */
public class boton extends JButton implements ActionListener {

    public boton(int x, int y, int ancho, int alto){
        setBounds(x, y, ancho , alto);
        setBackground(Color.white);
        //setText(x+","+y );
        addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(getBackground()==(Color.white)){
            setBackground(Color.darkGray);
            
        }else if(getBackground()==(Color.darkGray)){
            setBackground(Color.white);
            
        }   
    }
}
