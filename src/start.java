import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to student management app");
        while(true) {
            System.out.println("Please select any Choice");
            System.out.println("1. ADD A STUDENT");
            System.out.println("2. DELETE A STUDENT");
            System.out.println("3. DISPLAY A STUDENT");
            System.out.println("4. EXIT");
            int c =Integer.parseInt(bufferedReader.readLine());
            if(c==1){
               //add student
                System.out.println("Enter username");
                String sname = bufferedReader.readLine();
                System.out.println("Enter phone");
                String sphone = bufferedReader.readLine();
                System.out.println("Enter city");
                String scity = bufferedReader.readLine();

                Student st = new Student(sname,sphone,scity);
                boolean ans = StudentDao.insert(st);
                if(ans) System.out.println("Successful");
                else System.out.println("Something went wrong");
                System.out.println(st);

            }
            else if(c==2){
                System.out.println("Enter sid to Del");
                int sid = Integer.parseInt(bufferedReader.readLine());

                boolean ans = StudentDao.delete(sid);
                if(ans) System.out.println("Successful");
                else System.out.println("Something went wrong");

            }
            else if(c==3){
StudentDao.display();
            }
            else if(c==4){
                break;
            }
            else{

            }

        }
        System.out.println("Thank you visiting again");
    }
}
