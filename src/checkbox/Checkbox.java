/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Erick <00092217@uca.edu.sv>
 */
public class Checkbox extends JFrame{
    public JCheckBox check1;
     public JTextField codigo;
    private static final int ANCHOC = 130, ALTOC = 30;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Checkbox().setVisible(true);
            }
            
        });
        
    }
    public  Checkbox(){
        super("Titulo de la ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        formulario();
        Container container = getContentPane();
        container.add(check1);
        container.add(codigo);
        setSize(600,600);
    }
    public final void formulario(){
        check1 = new JCheckBox("Si");
        codigo = new JTextField();
        
        check1.addActionListener(new ManejaChecks());
        
        check1.setBounds(140,50,ANCHOC,ALTOC);
        codigo.setBounds(110, 10, ANCHOC, ALTOC);
    }
    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(check1.isSelected()==true){
                codigo.setText("Si wii");
            }
            if(check1.isSelected()==false){
                codigo.setText("");
            }
        }
        
    }
}
