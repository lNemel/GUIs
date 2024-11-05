import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    private JLabel myLabel;

    public MyFrame() {

        setTitle("JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        myLabel = new JLabel("Hola Mundo");
        add(myLabel);

        setVisible(true);
    }

    public static void main(String[] args) {

        new MyFrame();
    }
}