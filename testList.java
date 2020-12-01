/*
 Create AWT Choice Or Combobox Example 
 This java example shows how to create a choice or combobox using Java AWT 
 Choice class.
*/
 
import java.applet.Applet;
import java.awt.Choice;
 
/*
<applet code="CreateChoiceExample" width=200 height=200>
</applet>
*/
public class testList extends Applet{
 
 public void init(){
 
 /*
 * To create a AWT choice control or a combobox, use
 * Choice() 
 * constructor of AWT Choice class.
 */
 
 Choice language = new Choice();
 
 /*
 * To add items in a choice control or a combobox, use
 * void add(String item)
 * method of AWT Choice class.
 */
 language.add("Java");
 language.add("C++");
 language.add("VB");
 language.add("Perl");
 
 //add choice or combobox
 add(language);
 
 }
}