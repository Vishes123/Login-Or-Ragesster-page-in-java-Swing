package LoginRagiesterFrom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class Con_database {
    Connection connection;
    public Statement statement;
    public Con_database(){
        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms","root",  "Vishesh@123");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
