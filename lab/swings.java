import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{    
   JButton add,sub,mul,div,equals,clear; 
   JButton b[]=new JButton[10];
    int i,r,n1,n2;
    JTextField res;
    char op; 
   public Calculator()
  {
     super("Calulator");
      setLayout(new BorderLayout());
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(4,4));
      for(int i=0;i<=9;i++)
      {
        b[i]=new JButton(i+"");
        p.add(b[i]);
        b[i].addActionListener(this);
      }
      add=new JButton("+");
      p.add(add);
      add.addActionListener(this);
 
      sub=new JButton("-");
      p.add(sub);
      sub.addActionListener(this);
 
      mul=new JButton("*");
      p.add(mul);
      mul.addActionListener(this);
 
      div=new JButton("/");
      p.add(div);
      div.addActionListener(this);
 
      equals=new JButton("=");
      p.add(equals);
      equals.addActionListener(this);
 
      clear=new JButton("C");
      p.add(clear);
      clear.addActionListener(this);
 
      res=new JTextField(10);
      add(p,BorderLayout.CENTER);
      add(res,BorderLayout.NORTH);
      setVisible(true);
      setSize(400,400);
     }
public void actionPerformed(ActionEvent ae)
{
  JButton pb=(JButton)ae.getSource();
	if(pb==clear)
	{
	 r=n1=n2=0;
	 res.setText("");
	}
	else
		if(pb==equals)
		{
 		 n2=Integer.parseInt(res.getText());
  		 eval();
  		 res.setText(""+r);
		}
 
		else
		{
 		  boolean opf=false;
 		  if(pb==add)
			{ op='+';
			  opf=true;
			}
 		  if(pb==sub)
			{ op='-';opf=true;}
		  if(pb==mul)
			{ op='*';opf=true;}
		  if(pb==div)
			{ op='/';opf=true;}
	
		  if(opf==false)
		  {
  		   for(i=0;i<10;i++)
		   {
		  	if(pb==b[i])
     		  	{
           	   	String t=res.getText();
           		t+=i;
            		res.setText(t);
		  	}
		   }
		  }
		  else
		  {
    			n1=Integer.parseInt(res.getText());
     			res.setText("");
		  }
		}
}
int eval()
{
	switch(op)
	{
 	case '+':   r=n1+n2;  break;
 	case '-':    r=n1-n2;   break;
 	case '*':    r=n1*n2; break;
 	case '/':    r=n1/n2; break;
 
	}
	return 0;
}
 
  public static void main(String arg[])
  {
      new Calculator();
   }
}
