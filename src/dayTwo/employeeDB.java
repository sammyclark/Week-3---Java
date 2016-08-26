package dayTwo;

/**
 * Created by student on 25/08/2016.
 */

import java.sql.*; //in reality, you would make this more specific as this would make the program slow
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;

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

    public void queryAll() throws SQLException {
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * from employee");
        metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (rs.next()) {
            for (int i = 2; i <= columnCount; i++) { //index starts from 2 because we don't care about the id which is 1
                data.add(rs.getString(i));
            }
            TaskProcessing.createEmployee(data);
            data.clear(); //clears data
            rowCount++; //checks how many rows there are

        }
    }

    public void addEmployee(List<String> data) throws SQLException {
        PreparedStatement statement = con.prepareStatement("INSERT INTO employee (firstname,lastname, height,weight," +
                                                    "birthdate, sextype,position,hiredate) VALUES (?,?,?,?,?,?,?,?)");

        statement.setString(1, data.get(0));
        statement.setString(2, data.get(1));
        statement.setInt(3, Integer.parseInt(data.get(2)));
        statement.setDouble(4, Double.parseDouble(data.get(3)));
        statement.setDate(5, Date.valueOf(data.get(4)));
        statement.setString(6, data.get(5));
        statement.setString(7, data.get(6));
        statement.setDate(8, Date.valueOf(data.get(7)));

        statement.executeUpdate();
        statement.close();
    }

}
