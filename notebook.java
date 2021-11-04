import javax.swing.JTextArea;

public class notebook {

    JTextArea notebook = new JTextArea();

    frame fr = new frame();

    public void init() {
   
         fr.newFrame();
         notebook.setBounds(100, 100, 250, 300);
         fr.addArea(notebook);
     }
}
