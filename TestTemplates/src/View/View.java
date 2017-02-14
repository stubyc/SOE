package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MVCTemplates.TemplateView;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author cestuby
 */
public class View implements TemplateView {
    private JFrame frame;
    private JPanel panel;
    
    public View(String s) {
       frame = new JFrame(s);
       frame.setSize(700, 800);
       frame.setLayout(new GridLayout(3,1));
       panel = new JPanel();
       panel.setLayout(new FlowLayout());
       frame.add(panel);
       frame.setVisible(true);
    }  

    @Override
    public void Initialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Process() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
