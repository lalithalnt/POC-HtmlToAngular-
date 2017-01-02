package com.samples;

import java.awt.*;
import javax.swing.*;
 
public class JTabbedPaneExample extends JApplet  
{
  public void init()   
  {
    JTabbedPane jt = new JTabbedPane();
 
    jt.add("Colors", new CPanel());
    jt.add( "Fruits", new FPanel());
    jt.add("Vitamins", new VPanel( ) ) ;
 
    getContentPane().add(jt);
  }
}
class CPanel extends JPanel   
{
  public CPanel()   
  {
    JCheckBox cb1 = new JCheckBox("Red");
    JCheckBox cb2 = new JCheckBox("Green");
    JCheckBox cb3 = new JCheckBox("Blue");
    add(cb1);    add(cb2);    add(cb3) ;
  }      
}
class FPanel extends JPanel   
{
  public FPanel()   
  {
    JComboBox cb = new JComboBox();
    cb.addItem("Apple");
    cb.addItem("Mango");
    cb.addItem("Pineapple");
    add(cb);
  }
}
class VPanel extends JPanel   
{
  public VPanel()   
  {
    JButton b1 = new JButton("Vit-A");
    JButton b2 = new JButton("Vit-B");
    JButton b3 = new JButton("Vit-C");
    add(b1);    add(b2);    add(b3);
  }     
}