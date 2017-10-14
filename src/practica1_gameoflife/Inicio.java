/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_gameoflife;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Image;
/**
 *
 * @author Juan RigobertoZuñiga
 */
public class Inicio extends JFrame {
        JPanel panelBienvenida;
        JLabel  nombreJuego;
        JButton jugar;
        
    public Inicio(){
        //este codigo llama a la imagen desde el paquete 
        ImageIcon gameoflife = new ImageIcon(getClass().getResource("/imagenes/game-life.png"));
        nombreJuego = new JLabel(gameoflife);
        nombreJuego.setBounds(0,30,800,500);
        //aca se crea un objeto boton 
         Font f = new Font( "Arial",Font.ITALIC,30);
        jugar = new JButton();
        jugar.setFont(f);
        jugar.setBackground(Color.black);
        jugar.setForeground(Color.GREEN);
        jugar.setText("Jugar");
        jugar.setBounds(300, 400, 200,50);
        //jugar.setBackground(Color.white);
        //se agrega el eento al boton el cual concatena a la clase configuracion
        //y oculta el jframe actual
        jugar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //ACCIONES QUE HARA MI BOTON
                setVisible(false);
                Configuracion config=new Configuracion();
                config.setVisible(true);
            }
        });
        panelBienvenida=new JPanel();
        panelBienvenida.setLayout(null);
        panelBienvenida.add(nombreJuego);
        panelBienvenida.add(jugar);
        panelBienvenida.setBackground(Color.black);
        this.add(panelBienvenida);
        this.setSize(800,600);
        this.setForeground(Color.BLUE);
        this.setVisible(true);
        this.setTitle("GAME OF LIFE");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 100);
    }
}
