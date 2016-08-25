package dayTwo;

/**
 * Created by student on 25/08/2016.
 */

import java.sql.*; //in reality, you would make this more specific as this would make the program slow
import java.util.ArrayList;
import java.util.List;

public class employeeDB {

    List<Employee> employees = new ArrayList<>();
    List<String> data = new ArrayList<>();
    static Connection con;
    static Statement statement = null;
    static ResultSet rs = null;
    static ResultSetMetaData metaData;
    static int rowCount = 0;

    //do not do this in real life
    String userName = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/augustDpp?UseSSL=false"; //static connection to machine's database

    public employeeDB() throws Exception {
        //Load driver
        Class.forName("com.mysql.jdbc.Driver");
        //connect to augustDpp
        con = DriverManager.getConnection(url,userName,password);

    }

    public List<String> queryAll() throws Exception {
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * from employee");
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i < columnCount; i++) { //index starts from 1 because we don't care about the id which is O
                data.add(rs.getString(i));
            }
            TaskProcessing.printAll(data);
        }
    }

}
