package example_forSharaha;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by HVLLO on 23.02.2017.
 */
public class ColorForm extends JFrame implements ItemListener{
    private JCheckBox greenCh1, redCh2, blueCh3;
    private JButton but1;

    public ColorForm(){
        JFrame frame = new JFrame("Color Form");
        setBounds(500, 300, 300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String [] args){
        ColorForm cForm = new ColorForm();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
}


