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
/*
* en esta clase se crea un textbox el cuall va a recivir el tama;o deseado del tablero
tambien se crea un boton el cual va a crear una matriz de tipo int de [n][n] la cual es 
esnviada con el valor ingresado a la clase tabla
*/
public class Configuracion extends JFrame {
    JLabel titulo;
    JTextField textbox1;
    JButton aceptar;
    JPanel panel;
    int mat[][];
    int n;
    public Configuracion(){
        //configuracion de label
        titulo=new JLabel();
        titulo.setText("Ingrese Tama;o del tablero deseado");
        titulo.setBounds(15, 15, 300, 30);
        titulo.setForeground(Color.white);
        //cofiguracion de cuadro de texto
        textbox1=new JTextField();
        textbox1.setBounds(15, 50, 100, 30);
        //configuracion de boton
        aceptar=new JButton();
        aceptar.setText("Aceptar");
        aceptar.setBounds(120, 50, 100,30);
        aceptar.setBackground(Color.white);
        //aca se recibe el valor del textbox y crea una matriz enterea
        //se manda al valor n y la matriz a la clase tablero para la creacion de el arreglo de botones
        aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //ACCIONES QUE HARA MI BOTON
                n=Integer.parseInt(textbox1.getText());
                mat=new int[n][n];
                for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[i].length;j++){
                        mat[i][j]=0;
                    }
                }
                System.out.println(mat.length);
                Tablero t=new Tablero(n,mat);
                t.show();
                setVisible(false);
            }
        });
        //configuracion de panel
        panel=new JPanel();
        panel.setLayout(null);
        panel.add(titulo);
        panel.add(textbox1);
        panel.add(aceptar);
        panel.setBackground(Color.black);
        this.add(panel);
        this.setTitle("Configuraion");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,200);
        setLocation(300, 100);
    }
}
