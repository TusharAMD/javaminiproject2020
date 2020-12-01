import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet
{
  
  public void paint (Graphics g)
  {
    
    g.drawString("Hello World",20,20);
    g.drawString("Hi My Name is GUS Click Here To Go TO CyberTown",20,40);
    g.setColor(Color.red);
    g.fillRect(20,100,30,80);
    g.fillRect(85,100,30,80);
    g.fillRect(150,100,30,80);
    g.fillRect(215,100,30,80);
    g.setColor(Color.green);
    g.fillRect(20,130,80,30);
    g.fillRect(57,130,80,30);
    g.fillRect(115,130,80,30);
    g.fillRect(167,130,80,30);

    
   }
}