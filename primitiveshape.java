/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import javax.swing.JRadioButton;
/**
 *
 * @author VARSHINI M 
 */
public class primitiveshape extends Applet implements ActionListener
{
    JRadioButton s1,s2,s3;
    ButtonGroup color;
    int a;
    primitiveshape()
    {
        setLayout(null);
        s1=new JRadioButton("OVAL");
        s1.addActionListener(this);
        s1.setBounds(50, 50, 100, 30);
        add(s1);
        s2=new JRadioButton("SQUARE");
        s2.addActionListener(this);
        s2.setBounds(50, 100, 100, 30);
        add(s2);
        s3=new JRadioButton("RECTANGLE");
        s3.addActionListener(this);
        s3.setBounds(50, 150, 100, 30);
        add(s3);
     
        color=new ButtonGroup();
        color.add(s1);
        color.add(s2);
        color.add(s3);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if("OVAL".equals(str))
        {
           a=1; 
        }
        if("SQUARE".equals(str))
        {
            a=2;
        }
        if("RECTANGLE".equals(str))
        {
            a=3;
            
        }
        repaint();
        
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        if(a==1)
        {
            g.setColor(Color.red);
            g.drawOval(150,200,100,100);
        }
        if(a==2)
        {
            g.setColor(Color.green);
            g.drawRect(250, 250,100, 100);
        }
        if(a==3)
        {
           g.setColor(Color.yellow);
           g.drawRect(300,250,200,100); 
        }
    }

}
class shape extends JFrame
{
    Container b;
    shape()
    {
        b=getContentPane();
        primitiveshape a=new primitiveshape();
        b.add(a);
    }
}
class radiobutton
{
    public static void main(String[] args)
    {
        shape v=new shape();
        v.setTitle("PRIMITIVE SHAPE");
        v.setSize(2000, 2000);
        v.setVisible(true);
    }
}
        
        


    