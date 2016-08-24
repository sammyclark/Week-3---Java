package dayTwo;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

import static dayTwo.generatedPeople.people;

/**
 * Created by student on 24/08/2016.
 */
public class MainWindow implements ActionListener{
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblHeight;
    private JLabel lblWeight;
    private JLabel lblBirthdate;
    private JLabel lblSex;
    private JLabel lblPosition;
    private JLabel lblHireDate;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtHeight;
    private JTextField txtWeight;
    private JTextField txtBirthdate;
    private JTextField txtSex;
    private JTextField txtPosition;
    private JTextField txtHireDate;
    //can also do this in one line as seen below - preferably

    private JButton btnupdate;
    private JButton btnremove;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
    private JPanel inputPanel;
    private JPanel btnPanel;

    private JList employeeList;

    public MainWindow() {
        JFrame mainFrame = new JFrame("Employee Database");
        mainFrame.setSize(800,400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are you sure? Exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };
        //created the main window with a closing function

        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width/2 - mainFrame.getWidth()/2,di.height/2 - mainFrame.getHeight()/2);

        //centers window

        mainFrame.addWindowListener(l);

        mainFrame.setJMenuBar(createMenu());

        content = (JPanel) mainFrame.getContentPane();
        content.setLayout(new GridLayout(1,2,5,5));

        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());
        scrollPane.setPreferredSize(new Dimension(380,335));
        listPanel.add(scrollPane);
        content.add(listPanel);

        //created list panel - list of employees

        fieldPanel = new JPanel();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employee's Details");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER);
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);
        fieldPanel.setVisible(false);
        content.add(fieldPanel);

        //created field panel - inputs for employees

        mainFrame.setVisible(true);

    }

    private JMenuBar createMenu() {
        menuBar = new JMenuBar();

        //File Menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        newMenuItem = new JMenuItem("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_D);
        indexMenuItem = new JMenuItem("Search");
        indexMenuItem.setMnemonic(KeyEvent.VK_I);
        indexMenuItem.addActionListener(this);
        editMenu.add(indexMenuItem);

        menuBar.add(editMenu);

        return menuBar;
    }

    private JList createEmployeeList(){
        employeeList = new JList(people.toArray());
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        return employeeList;
    }

    private JPanel createFieldsPanel() {
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0,2,5,5));
        lblFirstName = new JLabel("First Name");
        inputPanel.add(lblFirstName);
        txtFirstName = new JTextField();
        inputPanel.add(txtFirstName);

        lblLastName = new JLabel("Last Name");
        inputPanel.add(lblLastName);
        txtLastName = new JTextField();
        inputPanel.add(txtLastName);

        lblHeight = new JLabel("Height");
        inputPanel.add(lblHeight);
        txtHeight = new JTextField();
        inputPanel.add(txtHeight);

        lblWeight = new JLabel("Weight");
        inputPanel.add(lblWeight);
        txtWeight = new JTextField();
        inputPanel.add(txtWeight);

        lblBirthdate = new JLabel("Birth Date (YYYY/MM/DD)");
        inputPanel.add(lblBirthdate);
        txtBirthdate = new JTextField();
        inputPanel.add(txtBirthdate);

        lblSex = new JLabel("Sex (M/F)");
        inputPanel.add(lblSex);
        txtSex = new JTextField();
        inputPanel.add(txtSex);

        lblPosition = new JLabel("Position");
        inputPanel.add(lblPosition);
        txtPosition = new JTextField();
        inputPanel.add(txtPosition);

        lblHireDate = new JLabel("Hire Date");
        inputPanel.add(lblHireDate);
        txtHireDate = new JTextField();
        inputPanel.add(txtHireDate);
        //Labels and Inputs for the employee details


        return inputPanel;
    }

    private JPanel createButtonPanel(){
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnupdate = new JButton("Update");
        btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnupdate);



        btnremove = new JButton("Remove");
        btnremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnremove);

        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
            if("New".equals(action)) {
                fieldPanel.setVisible(true);
            } else if ("Exit".equals(action)) {
                System.exit(0);
            }


    }

    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }

    public JTextField getTxtWeight() {
        return txtWeight;
    }

    public JTextField getTxtBirthdate() {
        return txtBirthdate;
    }

    public JTextField getTxtSex() {
        return txtSex;
    }

    public JTextField getTxtPosition() {
        return txtPosition;
    }

    public JTextField getTxtHireDate() {
        return txtHireDate;
    }

    public JPanel getInputPanel() {return inputPanel;}
}
