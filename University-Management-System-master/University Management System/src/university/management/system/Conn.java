package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "root@999");
            s = c.createStatement();
//            String query="select * from login";
//            ResultSet rs=s.executeQuery(query);
//            System.out.println(rs.next());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[]srgs){
//        new Conn();
//    }
}
