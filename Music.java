/* Java Program to Play Sound using Applet */
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;
public class Music extends Applet implements ActionListener
{
    ImageIcon pause,play,stop,replay;
    Image backGround;
    long current;
    Clip clip;
    public static String data;
    
    //Initialize the applet
    public void init()
    {
    setSize(700, 1000);
    //setBackground(Color.white);
    //Create image icons for the buttons
    pause = new ImageIcon("icon_pause.png");
    play = new ImageIcon("icon_play.png");
    stop = new ImageIcon("icon_stop.png");
    replay = new ImageIcon("icon_replay.png");
    
    /************************/
    /*
    Frame f= new Frame(); 
    
    
    Choice c=new Choice();
    JPanel p = new JPanel();
    //c.setBounds(500,500, 500,500);  
    c.setLocation(500,500);
    c.add("C");  
    c.add("C++");  
    c.add("Java");  
    c.add("PHP");  
    c.add("Android");
    Button b=new Button("Show"); 
    b.setBounds(200,100,50,20);  
    b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
             String data = "Programming language Selected: "+ c.getItem(c.getSelectedIndex());  
             label.setText(data);  
            }  
        }) ;   
    
    
    add(c);

    */
 
   /*
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Button b=new Button("Show");  
        b.setBounds(600,100,50,20);  
        final Choice c=new Choice();  
        c.setBounds(100,100, 75,75);  
        c.add("C");  
        c.add("C++");  
        c.add("Java");  
        c.add("PHP");  
        c.add("Android");  
        add(c);add(label);add(b);  
          
        
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
             String data = "Programming language Selected: "+ c.getItem(c.getSelectedIndex());  
             label.setText(data);  
            }  
        }) ;           
    */
    
    
    
    
    
    /****************************/
    }
    //Add buttons to applet and load the sound
    public void start()
    {
        JButton b_pause = new JButton(pause);
        this.add(b_pause);
        b_pause.addActionListener(this);
     
        JButton b_play = new JButton(play);
        this.add(b_play);
        b_play.addActionListener(this);
     
        JButton b_stop = new JButton(stop);
        this.add(b_stop);
        b_stop.addActionListener(this);
     
        JButton b_replay = new JButton(replay);
        this.add(b_replay);
        b_replay.addActionListener(this);
        
        
        /*********************/
        
        final Choice c=new Choice();
        final Label label = new Label();
        
        c.add("FurElise.wav");  
        c.add("sound1.wav");  
        c.add("NightMusic.mp3");  
        c.add("sound.wav");  
        c.add("Android");
        this.add(c);
        Button b=new Button("Play this One");
        this.add(b);
        label.setBounds(10, 10, 100, 20);
        label.setSize(400,100);
        //setLayout(new FlowLayout());
        //this.add(label);
        
        b.addActionListener(new ActionListener() 
        {  
            public void actionPerformed(ActionEvent e) {       
                 data = c.getItem(c.getSelectedIndex());  
                 //data="sound.wav";
                 //label.setText(data);
                try
                {
                    AudioInputStream audio;
                    
                    //data="sound.wav";
                    String nameOfMuisc = data; //"sound.wav";
                   
                    File file = new File (nameOfMuisc);
                    
                    
                    audio = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(audio);
                    current=0L;
                }
                catch(Exception E)
                {
                    System.out.println(E.getMessage());
                }
             
             
             
             
             
             
             
             
             
             
            }  
        });           
        
        
        /*********************/
        
    
    
    
    
    
        
        }   
        //Function to perform the selected option
        public void actionPerformed(ActionEvent e)
        {
        String icon = ((JButton)e.getSource()).getIcon().toString();
     
        if(icon.equals(pause.toString()))
        {
            current = clip.getMicrosecondPosition();
            clip.stop();
        }
        else if(icon.equals(play.toString()))
        {
            clip.setMicrosecondPosition(current);
            clip.start();
        }
        else if(icon.equals(stop.toString()))
        {
            current = 0L;
            clip.setMicrosecondPosition(0);
            clip.stop();
        }
        else
        {
            current = 0L;
            clip.setMicrosecondPosition(0); 
            clip.start();
        }
 
    }
}
/*
<applet code = Music.java width=750 height=400>
</applet>
*/