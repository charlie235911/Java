import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * D1051712_1
 */
public class D1051712_1 {
    public static void main(String[] args) {
        MainFrame mFrm = new MainFrame();
        mFrm.setVisible(true);
    }
    
}

class MainFrame extends JFrame{
    public MainFrame(){
        init();
    }
    private int y = 0;

    private void init(){
        Container cp = this.getContentPane();
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setBackground(new Color(128, 228, 228));
        cp.setLayout(null);

        

        JLabel jlb = new JLabel(""+y, SwingConstants.CENTER);
        jlb.setOpaque(true);
        jlb.setBackground(new Color(250, 128, 114));
        jlb.setForeground(Color.BLUE);

        JButton jbtnExit = new JButton("Exit");
        jbtnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });

        JButton jbtnAdd = new JButton("ADD");
        jbtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y += 1;
                jlb.setText(""+y);
            }
        });

        JButton jbtnSub = new JButton("SUB");
        jbtnSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y -= 1;
                jlb.setText(""+y);
            }
        });

        jbtnExit.setBounds(140, 200, 120, 35);
        jbtnAdd.setBounds(110, 150, 60, 35);
        jbtnSub.setBounds(230, 150, 60, 35);
        jlb.setBounds(170, 75, 60, 35);
        cp.add(jbtnExit);
        cp.add(jbtnAdd);
        cp.add(jbtnSub);
        cp.add(jlb);
    }
}