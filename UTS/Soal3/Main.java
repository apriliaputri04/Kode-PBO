package UTS.Soal3;

public class Main {  
    public static void main(String[] args) {  
       // Create a new user  
       User user = new User(1, "password123");  
       user.logIn(1, "password123");  
       user.recoverPassword();  
       user.logOut();  
   
       // Create a new customer  
       Customer customer = new Customer(2, "password123", true);  
       customer.applyVerification("123456789", "driver's license", "passport");  
   
       // Create a new admin  
       Admin admin = new Admin(3, "password123");  
       admin.updateVehicleDetails(1);  
       admin.addVehicle();  
       admin.removeVehicle();  
       admin.verifyUser();  
    }  
 }