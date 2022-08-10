import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insert(Student st)  {
        boolean f = false;
        try {
            Connection con = CP.create();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement psmt = con.prepareStatement(q);
            psmt.setString(1,st.getSname());
            psmt.setString(2,st.getSphone());
            psmt.setString(3,st.getScity());
            psmt.executeUpdate();
            f=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean delete(int sid) {
        boolean f = false;
        try {
            Connection con = CP.create();
            String q = "delete from students where sid=?";
            PreparedStatement psmt = con.prepareStatement(q);
            psmt.setInt(1,sid);

            psmt.executeUpdate();
            f=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void display() {

        try {
            Connection con = CP.create();
            String q = "select * from students";
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery(q);

           while(set.next()){
int id  = set.getInt(1);
String name = set.getString(2);
String phone = set.getString(3);
String city = set.getString("scity");
               System.out.println("ID : " + id +" "+ "Name : "+name +" "+ "Phone : "+phone+" " + "City : "+city);
               System.out.println("----------------------------------------------------------------------");
           }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
