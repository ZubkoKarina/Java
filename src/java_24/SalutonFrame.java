package java_24;

import javax.swing.*;
import java.awt.*;

public class SalutonFrame extends JFrame {
    
    public SalutonFrame(){
        super("Saluton mondo!"); 
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //кнопки
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Play");
        add(play);
        //метки 
        JLabel pageLabel = new JLabel("адрес");
        JTextField pageAddress = new JTextField("ger", 20);
        FlowLayout flo1 = new FlowLayout();
        setLayout(flo1);
        add(pageLabel);
        add(pageAddress);
        //флажки 
        JCheckBox frog = new JCheckBox("Jumbo", true);
        ButtonGroup meals = new ButtonGroup();
        meals.add(frog);
        add(frog);
        //списки вып
        JComboBox profession = new JComboBox();
        profession.addItem("fffv");
        add(profession);
        //текстовое поле
        JTextArea com = new JTextArea("efr",1,7);
        add(com);
        
        setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "javax.swing.plaf.nimus.NimbuslookAndFeel");
        } catch (Exception exc){
            //игнорировать
        }
    }

    public static void main(String[] arguments){
        SalutonFrame frame = new SalutonFrame();
    }
}
