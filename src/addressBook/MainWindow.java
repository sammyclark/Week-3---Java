package addressBook;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by student on 25/08/2016.
 */
public class MainWindow {
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu;
    private JMenuItem menuNew, menuExit, menuSearch;
    //containers for menu
    private JPanel content, listPanel, fieldPanel, inputPanel, btnPanel;
    //containers for panels

    public MainWindow() {
        JFrame mainFrame = new JFrame("Contacts");
        mainFrame.setSize(800,400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };
        //created constructor to build the main frame.
        //not resizable
        //program terminated using a windowClosing pop up method

        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width/2 - mainFrame.getWidth()/2,di.height/2 - mainFrame.getHeight()/2);

        //centers window

        mainFrame.addWindowListener(l);

       //mainFrame.setJMenuBar(createMenu());
        //set the menu bar

        //content = (JPanel) mainFrame.getContentPane();
        //content.setLayout(new GridLayout(1,2,5,5));

        //created the content panel (main box) - list panel and field panel inside the content panel
       // prepareJList();

        //listPanel = new JPanel();
       // listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
       // JScrollPane scrollPane = new JScrollPane(createEmployeeList());
        //scrollPane.setPreferredSize(new Dimension(380,335));
       // listPanel.add(scrollPane);
       // listPanel.setVisible(false);
       // content.add(listPanel);

        //created list panel - list of employees


        //fieldPanel = new JPanel();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employee's Details");
       // fieldPanel.setBorder(title);
       // fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER);
      //  fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);
      //  fieldPanel.setVisible(false);
      //  content.add(fieldPanel);

        //created field panel - inputs for employees

        mainFrame.setVisible(true);

        //means the main frame can be seen

    }

    private JMenuBar createMenu() {
        menuBar = new JMenuBar();

        //File Menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuNew = new JMenuItem("New");
        menuNew.setMnemonic(KeyEvent.VK_N);
        //menuNew.addActionListener(this);
        //action listener invokes controller
        fileMenu.add(menuNew);


        //exitMenuItem = new JMenuItem("Exit");
        //exitMenuItem.setMnemonic(KeyEvent.VK_E);
        //exitMenuItem.addActionListener(this);
        //fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        //adds file to menu bar - file has new and exit options

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_D);
       // indexMenuItem = new JMenuItem("Search");
        //indexMenuItem.setMnemonic(KeyEvent.VK_I);
        //indexMenuItem.addActionListener(this);
        //editMenu.add(indexMenuItem);


        menuBar.add(editMenu);
        //adds edit to menu bar - edit has search option

        return menuBar;
    }

}
