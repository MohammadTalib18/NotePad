//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.io.*;
//import javax.swing.filechooser.*;
//
//public class Notepad extends JFrame{
//    
//     private JTextArea area;
//    private JScrollPane scpane;
//    String text = "";
//       
//     Notepad(){
//         
//         getContentPane().setBackground(Color.WHITE);
//         setLayout(null);
//         
//     setTitle("Notepad");  
//        setSize(300, 200);
//         
//        
//          ImageIcon hotel= new ImageIcon(ClassLoader.getSystemResource("icons/Icons.png"));
//     Image icon =hotel.getImage();
//     setIconImage(icon);
//         JMenuBar mb= new JMenuBar();
//         mb.setBackground(Color.WHITE);
//        mb.setBounds(10,0,1550,30);
//        add(mb);
//                
//        JMenu file =new JMenu("File");
//        file.setForeground(Color.BLACK);
//        mb.add(file);
//        
//        JMenuItem New=new JMenuItem("New");
////        New.addActionListener(this);
//        file.add(New);
//
//             JMenuItem window=new JMenuItem("New Window");
////        New.addActionListener(this);
//        file.add(window);
//        
//        JMenuItem open=new JMenuItem("Open");
////        New.addActionListener(this);
//        file.add(open);
//        
//        JMenuItem save=new JMenuItem("Save");
////        New.addActionListener(this);
//        file.add(save);
//        
//        JMenuItem save1=new JMenuItem("Save as");
////        New.addActionListener(this);
//        file.add(save1);
//        
//     
//          JMenuItem set=new JMenuItem("Page Setup");
////        New.addActionListener(this);
//        file.add(set);
//        
//        
//        
//          JMenuItem print=new JMenuItem("Print");
////        New.addActionListener(this);
//        file.add(print);
//        
//        
//          JMenuItem exit=new JMenuItem("Exit");
////        New.addActionListener(this);
//        file.add(exit);
//        
//            JMenu edit =new JMenu("Edit");
//        edit.setForeground(Color.BLACK);
//        mb.add(edit);
//        
//        JMenuItem cut=new JMenuItem("Cut");
////        New.addActionListener(this);
//        edit.add(cut);
//        
//        JMenuItem copy=new JMenuItem("Copy");
////        New.addActionListener(this);
//        edit.add(copy);
//        
//        JMenuItem past=new JMenuItem("Past");
////        New.addActionListener(this);
//        edit.add(past);
//        
//        JMenuItem undo=new JMenuItem("Undo");
////        New.addActionListener(this);
//        edit.add(undo);
//        
//        JMenuItem select=new JMenuItem("Select All");
////        New.addActionListener(this);
//        edit.add(select);
//        
//        
//         JMenu format =new JMenu("Format");
//        format.setForeground(Color.BLACK);
//        mb.add(format);
//        
//        
//            JMenuItem rap=new JMenuItem("Word Wrap");
////        New.addActionListener(this);
//        format.add(rap);
//        
//            JMenuItem font=new JMenuItem("Font");
////        New.addActionListener(this);
//        format.add(font);
//        
//        
//        
//         
//         JMenu view =new JMenu("view");
//        view.setForeground(Color.BLACK);
//        mb.add(view);
//        
//        
//            JMenuItem zoom=new JMenuItem("Zoom");
////        New.addActionListener(this);
//        view.add(zoom);
//        
//            JMenuItem bar=new JMenuItem("Status Bar");
////        New.addActionListener(this);
//        view.add(bar);
//        
//        
//        
//        JMenu help =new JMenu("Help");
//        help.setForeground(Color.BLACK);
//        mb.add(help);
//        
//        
//            JMenuItem viewhelp=new JMenuItem("View Help");
//           
////        New.addActionListener(this);
//        view.add(viewhelp);
//        
//            JMenuItem feedback=new JMenuItem("Send Feedback");
////        New.addActionListener(this);
//        view.add(feedback);
//        
//        
//         JMenuItem about=new JMenuItem(" About Notepad");
////        New.addActionListener(this);
//        view.add(about);
//        
//             
//       
//      area = new JTextArea();
//        area.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
//        area.setLineWrap(true);
//        area.setWrapStyleWord(true);
//        
//        scpane = new JScrollPane(area); 
//        scpane.setBorder(BorderFactory.createEmptyBorder());
//        
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        
//         setBounds(150,50,1000,600);
//         setVisible(true);
//         
//         
//              
//        
//        
//        
//}
//   
//    public static void main(String[] args) {
//     new Notepad();
//    }
//    
//}



package notepad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.*;

public class Notepad extends JFrame implements ActionListener {

    private JTextArea area;
    private JScrollPane scpane;
    String text = "";
    public Notepad() {
        super("Notepad");
        setSize(1950, 1050);
        
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar(); //menubar
          menuBar.setBackground(Color.WHITE);
        
        JMenu file = new JMenu("File"); //file menu
        
        JMenuItem newdoc = new JMenuItem("New");
        newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newdoc.addActionListener(this);
        
        JMenuItem open = new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.addActionListener(this);
        
        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        
        JMenuItem print = new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        print.addActionListener(this);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        exit.addActionListener(this);
        
        JMenu edit = new JMenu("Edit");
        
        JMenuItem copy = new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copy.addActionListener(this);
        
        JMenuItem paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        paste.addActionListener(this);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cut.addActionListener(this);
        
        JMenuItem selectall = new JMenuItem("Select All");
        selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        selectall.addActionListener(this);
        
        
        JMenu about = new JMenu("Help");
        
        JMenuItem notepad = new JMenuItem("About Notepad");
        notepad.addActionListener(this);
        
        area = new JTextArea();
        area.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        
        scpane = new JScrollPane(area); 
        scpane.setBorder(BorderFactory.createEmptyBorder());
        
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(about);

        file.add(newdoc);
        file.add(open);
        file.add(save);
        file.add(print);
        file.add(exit);
        
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        edit.add(selectall);
        
        about.add(notepad);

        add(scpane, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("New")) {
            area.setText("");
        
        } else if (ae.getActionCommand().equals("Open")) {
            JFileChooser chooser = new JFileChooser("D:/Java");
            chooser.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
            chooser.addChoosableFileFilter(restrict);
    	
            int result = chooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
				
                try{
                    System.out.println("HEki");
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    area.read( br, null );
                    br.close();
                    area.requestFocus();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        } else if(ae.getActionCommand().equals("Save")){
            final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("Save");
            int actionDialog = SaveAs.showOpenDialog(this);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                area.write(outFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(ae.getActionCommand().equals("Print")){
            try{
                area.print();
            }catch(Exception e){}
        }else if (ae.getActionCommand().equals("Exit")) {
            System.exit(0);
        }else if (ae.getActionCommand().equals("Copy")) {
            text = area.getSelectedText();
        }else if (ae.getActionCommand().equals("Paste")) {
            area.insert(text, area.getCaretPosition());
        }else if (ae.getActionCommand().equals("Cut")) {
            text = area.getSelectedText();
            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }else if (ae.getActionCommand().equals("Select All")) {
            area.selectAll();
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}