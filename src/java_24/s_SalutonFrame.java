package java_24;

import javax.swing.*;
import java.awt.*;

public class s_SalutonFrame extends JFrame {
    
    public s_SalutonFrame(){
        super("Saluton mondo!"); 
        setLookAndFeel();
        setSize(700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //кнопки
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Play");
        add(play);
        
       
        //текстовое поле
        JTextArea com = new JTextArea("$",1,7);
        add(com);
        
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main(String[] arguments){
        s_SalutonFrame frame = new s_SalutonFrame();
    }
}
