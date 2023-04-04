package Pro;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class Crossword extends JFrame {
    private JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19 ;
    private JButton A,E,B,T,enter,delete ;
    private JTextField text;
    private JLabel label;
    
    public Crossword(){
        super("Crossword");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        //สร้างสี
        Color color=new Color(213, 239 ,213);//เขียว
        Color color2=new Color(250, 239 ,200);//เหลือง
        Color black = Color.BLACK;
        Color white = Color.WHITE;
        c.setBackground(white);
        
        //สร้างFont
        Font font = new Font("Courier",Font.PLAIN|Font.BOLD,30);
        
        //สร้างปุ่มโจทย์ กดไม่ได้
        c1 = new JButton (""); c1.setBackground(black);  
        c2 = new JButton (""); c2.setBackground(black);  
        c3 = new JButton (""); c3.setBackground(black); 
        c4 = new JButton (""); c4.setBackground(black);
        c5 = new JButton (""); c5.setBackground(black); 
        c6 = new JButton (""); c6.setBackground(black);
        c7 = new JButton (""); c7.setBackground(black);
        c8 = new JButton (""); c8.setBackground(black);
        c9 = new JButton (""); c9.setBackground(black); 
        c10 = new JButton (""); c10.setBackground(black); 
        c11 = new JButton (""); c11.setBackground(black); 
        c12 = new JButton (""); c12.setBackground(black); 
        c13 = new JButton (""); c13.setBackground(black); 
        c14 = new JButton (""); c14.setBackground(black); 
        c15 = new JButton (""); c15.setBackground(black); 
        c16 = new JButton (""); c16.setBackground(black);  
        c17 = new JButton (""); c17.setBackground(black); 
        c18 = new JButton (""); c18.setBackground(black); 
        c19 = new JButton (""); c19.setBackground(black); 

        c1.setFont(font); c1.setEnabled(false);
        c2.setFont(font); c2.setEnabled(false);
        c3.setFont(font); c3.setEnabled(false);
        c4.setFont(font); c4.setEnabled(false);
        c5.setFont(font); c5.setEnabled(false);
        c6.setFont(font); c6.setEnabled(false);
        c7.setFont(font); c7.setEnabled(false);
        c8.setFont(font); c8.setEnabled(false);
        c9.setFont(font); c9.setEnabled(false);
        c10.setFont(font); c10.setEnabled(false);
        c11.setFont(font); c11.setEnabled(false);
        c12.setFont(font); c12.setEnabled(false);
        c13.setFont(font); c13.setEnabled(false);
        c14.setFont(font); c14.setEnabled(false);
        c15.setFont(font); c15.setEnabled(false);
        c16.setFont(font); c16.setEnabled(false);
        c17.setFont(font); c17.setEnabled(false);
        c18.setFont(font); c18.setEnabled(false);
        c19.setFont(font); c19.setEnabled(false);
        
        add (c1);  c1.setBounds (145, 40, 60, 60);
        add (c2);  c2.setBounds (210, 40, 60, 60);
        add (c3);  c3.setBounds (275, 40, 60, 60);
        add (c4);  c4.setBounds (340, 40, 60, 60);
        add (c5);  c5.setBounds (145, 105, 60, 60);
        add (c6);  c6.setBounds (275, 105, 60, 60);
        add (c7);  c7.setBounds (15, 170, 60, 60);
        add (c8);  c8.setBounds (80, 170, 60, 60);
        add (c9);  c9.setBounds (145, 170, 60, 60);
        add (c10);  c10.setBounds (275, 170, 60, 60);
        add (c11);  c11.setBounds (340, 170, 60, 60);
        add (c12);  c12.setBounds (405, 170, 60, 60);
        add (c13);  c13.setBounds (80, 235, 60, 60);
        add (c14);  c14.setBounds (405, 235, 60, 60);
        add (c15);  c15.setBounds (15, 300, 60, 60);
        add (c16);  c16.setBounds (80, 300, 60, 60);
        add (c17);  c17.setBounds (145, 300, 60, 60);
        add (c18);  c18.setBounds (210, 300, 60, 60);
        add (c19);  c19.setBounds (405, 300, 60, 60);

        //สร้างปุ่มตัวอักษรไว้กด
        A = new JButton ("A"); A.setBackground(color); A.setFont(font);
        E = new JButton ("E"); E.setBackground(color); E.setFont(font);
        B = new JButton ("B"); B.setBackground(color); B.setFont(font);
        T = new JButton ("T"); T.setBackground(color); T.setFont(font);
        
        //สร้างส่วนประกอบอื่น
        enter = new JButton ("Enter");
        delete = new JButton ("Delete");
        enter.setBackground(color2);
        delete.setBackground(color2);
        text = new JTextField ("");
        label = new JLabel ("");
        text.setFont(font);  text.setBackground(color2);
        text.setEditable(false);
        text.setHorizontalAlignment(SwingConstants.CENTER);

        add (A);  A.setBounds (75, 630, 60, 60);
        add (E);  E.setBounds (165, 630, 60, 60);
        add (B);  B.setBounds (260, 630, 60, 60);
        add (T);  T.setBounds (350, 630, 60, 60);
        add (enter);  enter.setBounds (135, 550, 90, 30);
        add (delete); delete.setBounds (260, 550, 90, 30);
        add (text);   text.setBounds (80, 425, 315, 70);
        add (label);  label.setBounds (150, 500, 150, 40);
        
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                text.setText(word+" A");
            }
        });

        E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                text.setText(word+" E");
            }
        });


        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                text.setText(word+" B");
            }
        });


        T.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                text.setText(word+" T");
            }
        });
         
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                if(word.equals(" B E T A")){
                    c1.setText("B"); c1.setBackground(color);  
                    c2.setText("E"); c2.setBackground(color);  
                    c3.setText("T"); c3.setBackground(color); 
                    c4.setText("A"); c4.setBackground(color);
                }
                if(word.equals(" B A T")){
                    c1.setText("B"); c1.setBackground(color);  
                    c5.setText("A"); c5.setBackground(color);  
                    c9.setText("T"); c9.setBackground(color); 
                }
                if(word.equals(" T A B")){
                    c3.setText("T"); c3.setBackground(color);  
                    c6.setText("A"); c6.setBackground(color);  
                    c10.setText("B"); c10.setBackground(color); 
                }
                if(word.equals(" E A T")){
                    c7.setText("E"); c7.setBackground(color);  
                    c8.setText("A"); c8.setBackground(color);  
                    c9.setText("T"); c9.setBackground(color); 
                }
                if(word.equals(" B E T")){
                    c10.setText("B"); c10.setBackground(color);  
                    c11.setText("E"); c11.setBackground(color);  
                    c12.setText("T"); c12.setBackground(color); 
        
                }
                if(word.equals(" A T E")){
                    c8.setText("A"); c8.setBackground(color);  
                    c13.setText("T"); c13.setBackground(color);  
                    c16.setText("E"); c16.setBackground(color); 
                }
                if(word.equals(" T E A")){
                    c12.setText("T"); c12.setBackground(color);  
                    c14.setText("E"); c14.setBackground(color);  
                    c19.setText("A"); c19.setBackground(color); 
                }
                if(word.equals(" B E A T")){
                    c15.setText("B"); c15.setBackground(color);  
                    c16.setText("E"); c16.setBackground(color);  
                    c17.setText("A"); c17.setBackground(color); 
                    c18.setText("T"); c18.setBackground(color);
                }
                text.setText("");
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                text.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,800);
        setVisible(true);
        setResizable(false);
        //setLocation(500,300);
    } 

    public static void main(String[] args){
        new Crossword();
    }
}