package dayTwo;

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
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem; //this is an example of one line

    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
    private JPanel inputPanel;
    private JPanel btnPanel;

    private JList employeeList;
    private int employeeIndex = -1;
    private boolean createNew;

    //declared components

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
        //created constructor to build the main frame.
        //not resizable
        //program terminated using a windowClosing pop up method

        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width/2 - mainFrame.getWidth()/2,di.height/2 - mainFrame.getHeight()/2);

        //centers window

        mainFrame.addWindowListener(l);

        mainFrame.setJMenuBar(createMenu());

        //set the menu bar

        content = (JPanel) mainFrame.getContentPane();
        content.setLayout(new GridLayout(1,2,5,5));

        //created the content panel (main box) - list panel and field panel inside the content panel
        prepareJList();

        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());
        scrollPane.setPreferredSize(new Dimension(380,335));
        listPanel.add(scrollPane);
        listPanel.setVisible(false);
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

        //means the main frame can be seen

    }

    private JMenuBar createMenu() {
        menuBar = new JMenuBar();

        //File Menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        newMenuItem = new JMenuItem("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.addActionListener(this);
        //action listener invokes controller
        fileMenu.add(newMenuItem);


        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        //adds file to menu bar - file has new and exit options

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_D);
        indexMenuItem = new JMenuItem("Search");
        indexMenuItem.setMnemonic(KeyEvent.VK_I);
        indexMenuItem.addActionListener(this);
        editMenu.add(indexMenuItem);


        menuBar.add(editMenu);
        //adds edit to menu bar - edit has search option

        return menuBar;
    }

    private void prepareJList() {
        employeeList = new JList();
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        employeeList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                employeeIndex = employeeList.getSelectedIndex(); //gets index of whatever is in the list and selects it
                if (people.size() > 0 && employeeIndex != -1)
                    loadEmployeeFields(employeeIndex); //if there is something display it
                else
                    clearTxtFields(); //if there is not, keep text fields empty
            }
        });
    }

    //dynamically reloads list

    private JList createEmployeeList(){
        DefaultListModel listModel = new DefaultListModel();
        if(people.size() > 0) {
            for (Employee e: people)
                listModel.addElement(e);
        }
        employeeList.setModel(listModel);
        //if there are people in the employee list, it is displayed - dynamic display

        return employeeList;

    }

    //displays list of employees - however, does not dynamically reload list without prepareJList

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

        lblBirthdate = new JLabel("Birth Date (YYYY-MM-DD)");
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

        lblHireDate = new JLabel("Hire Date (YYYY-MM-DD)");
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
                if(createNew && employeeList.isSelectionEmpty()) {
                    TaskProcessing.createEmployee(getFieldsInfo());
                    createEmployeeList();
                    createNew = false;
                    clearTxtFields();
                }
                else
                {
                    TaskProcessing.editDetails(employeeIndex, getFieldsInfo());
                    createEmployeeList();
                }
                createNew = false;
                employeeIndex = -1;
            }
        });
        btnPanel.add(btnupdate);



        btnremove = new JButton("Remove");
        btnremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (employeeIndex >= 0) {
                    TaskProcessing.removeEmployee(employeeIndex); //removes the employee at the index selected
                    createEmployeeList();
                    employeeIndex = -1;
                } else {
                    JOptionPane.showMessageDialog(null, "No employee selected!");
                }
            }
        });
        btnPanel.add(btnremove);

        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
            if("New".equals(action)) {
                clearTxtFields();
                if(employeeIndex < 0)
                createNew = true;
                listPanel.setVisible(true);
                fieldPanel.setVisible(true);
            } else if ("Exit".equals(action)) {
                System.exit(0);
            } else if ("Search".equals(action)) {
                String fnSearch = JOptionPane.showInputDialog("Enter first name");
                employeeIndex = TaskProcessing.searchByFirstName(fnSearch);
                loadEmployeeFields((employeeIndex)); //when user inputs string, it is searched for
                if(employeeIndex != -1)
                    loadEmployeeFields(employeeIndex);
                else
                    JOptionPane.showMessageDialog(null, "Cannot find it");
            }


    }

    private void clearTxtFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtBirthdate.setText("");
        txtSex.setText("");
        txtPosition.setText("");
        txtHireDate.setText("");
    }
    //clears all text fields for employee details

    private void loadEmployeeFields(int index) {
        txtFirstName.setText(people.get(index).getFirstName());
        txtLastName.setText(people.get(index).getLastName());
        txtHeight.setText(Short.toString(people.get(index).getHeight()));
        txtWeight.setText(Double.toString(people.get(index).getWeight()));
        txtBirthdate.setText(people.get(index).getBirthday().toString());
        txtSex.setText(people.get(index).getSex().toString());
        txtPosition.setText(people.get(index).getPosition());
        txtHireDate.setText(people.get(index).getHireDate().toString());
    }

    private List<String> getFieldsInfo() {
        List<String> data = new ArrayList<>();

        data.add(txtFirstName.getText());
        data.add(txtLastName.getText());
        data.add(txtHeight.getText());
        data.add(txtWeight.getText());

        String[] stringDOB = txtBirthdate.getText().split("-");
        data.add(stringDOB[0]);
        data.add(stringDOB[1]);
        data.add(stringDOB[2]);

        data.add(txtSex.getText());
        data.add(txtPosition.getText());

        String[] stringHireDate = txtHireDate.getText().split("-");
        data.add(stringHireDate[0]);
        data.add(stringHireDate[1]);
        data.add(stringHireDate[2]);

        return data;
    }

    //collects the data from the texts fields

}
