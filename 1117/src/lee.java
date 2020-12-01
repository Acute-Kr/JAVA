import javax.swing.*;

import java.awt.event.*;

import java.awt.*;



public class lee extends JFrame {

JPanel contentPane=new JPanel();

JLabel la;


lee()

{

setTitle("Mouse 이벤트 예제");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


setContentPane(contentPane);

contentPane.setLayout(null);

contentPane.addMouseListener(new MyMouseListener());


la=new JLabel("c");

la.setSize(50,20);

la.setLocation(100,100);

contentPane.add(la);

setSize(300,300);

setVisible(true);

}

class MyMouseListener implements MouseListener

{

public void mousePressed(MouseEvent e)

{

int x=(int)Math.round(Math.random()*299+1);

int y=(int)Math.round(Math.random()*299+1);

la.setLocation(x,y);

}

public void mouseReleased(MouseEvent e)

{}

public void mouseClicked(MouseEvent e){}

public void mouseEntered(MouseEvent e){}

public void mouseExited(MouseEvent e){}

}

public static void main(String[] args)

{

new lee();

}



}

