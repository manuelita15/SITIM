
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class caja_de_password
{
static JFrame ventana;
static JPasswordField  caja_de_password;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ;

public void caja_de_password()
{
ventana= new JFrame(" Caja de texto o TextField") ;
caja_de_password = new JPasswordField (8);
ventana.add(caja_de_password);
ventana.reshape(550,200,200,200);
ventana.setLayout(new FlowLayout());
ventana.show();	
}

public static void main (String [] args)
 {
 	caja_de_password x=new caja_de_password();
 	x.caja_de_password();
 
 }
	

}