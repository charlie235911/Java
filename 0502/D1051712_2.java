import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1051712_2 {
    public static void main(String[] args) {
        MainFrame2 mFrm2 = new MainFrame2();
        mFrm2.setVisible(true);
    }
}

class MainFrame2 extends JFrame{
    private JTextField jtf = new JTextField("");
    private JLabel jlb1 = new JLabel( "n: ", SwingConstants.CENTER);
    private JLabel jlb2 = new JLabel( "");
    private JButton jbtnExit = new JButton("EXIT");
    private JButton jbtnRUN = new JButton("=");
    public MainFrame2(){
        init();
    }

    private void init(){
        Container cp = this.getContentPane();
        this.setBounds(100, 100, 400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(null);
        jlb1.setBounds(50,50, 80, 35);
        cp.add(jlb1);
        jtf.setBounds(110, 50, 50, 35);
        cp.add(jtf);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jbtnRUN.setBounds(160, 50, 50, 35);
        jbtnRUN.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int i = Integer.parseInt(jtf.getText());
                int ans = 1;
                for(int j = i; j >= 1; j--){
                    ans *= j;
                }
                jlb2.setText(jtf.getText()+"! = "+Integer.toString((int)ans));
            }
        });
        cp.add(jbtnRUN);
        jlb2.setBounds(215,50, 120, 35);
        cp.add(jlb2);
        jbtnExit.setBounds(270, 120, 80, 35);
        jbtnExit.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent e ){
                System.exit(0);
            }
        });
        cp.add(jbtnExit);
    }
}