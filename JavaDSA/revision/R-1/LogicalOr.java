import java.util.*;
public class LogicalOr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your role in the system");
        System.out.println("Note! the system is Case Sensitive");
        String role = sc.nextLine();

        if (role.equals("Admin") || role.equals("Manager")){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
        sc.close();
    }
    
}
