import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class comboBoxD extends JFrame {
  private String[] languages = {
    "English", "Math", "marathi", "science",
    "history", "Geography", "Economics", 
  };
  
  private JTextField textfield1 = new JTextField
   ("Top  subject : ");

  private JTextField textfield2 = new JTextField(15);
  private JComboBox comboBox = new JComboBox();
  
  private int count = 0;

  public comboBoxD() {
 for(int i = 0; i < languages.length; i++)
   comboBox.addItem(languages[count++]);
 textfield1.setEditable(false);

 comboBox.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) {
  textfield2.setText("You choosed : " +      
       ((JComboBox)e.getSource()).getSelectedItem());
       textfield2.setEditable(false);
   }
 });
 
 setLayout(new FlowLayout());
 add(textfield1);
 add(textfield2);
 add(comboBox);    
 }
 
  public static void main(String[] args) {
 setFrame(new comboBoxD(), 250, 150);
  }

  public static void 
  setFrame(final JFrame frame, final int width, final int height) {
 SwingUtilities.invokeLater(new Runnable() {
   public void run() {
     frame.setTitle(frame.getClass().getSimpleName());
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(width, height);
     frame.setVisible(true);
   }
 });
 }

}