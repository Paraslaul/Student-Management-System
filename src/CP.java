import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
     static Connection con;
   public static Connection create(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "Paras@123";
            String url = "jdbc:mysql://localhost:3306/studentdb?autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
