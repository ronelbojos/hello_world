import javax.swing.JOptionPane;
public class Hello {
  public static void main (String [] args) {
    System.out.println("Hello World!");
    String name = JOptionPane.showInputDialog("What's your name?","Ron");
    JOptionPane.showMessageDialog(null,"Hello " + name + ", nice to meet you!");
  }
}
