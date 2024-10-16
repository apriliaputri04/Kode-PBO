package UTS.Soal3;

public class Admin extends User {  
    public Admin(int userId, String password) {  
       super(userId, password);  
    }  
   
    public void updateVehicleDetails(int vehicleId) {  
       System.out.println("Updating vehicle details");  
    }  
   
    public void addVehicle() {  
       System.out.println("Adding vehicle");  
    }  
   
    public void removeVehicle() {  
       System.out.println("Removing vehicle");  
    }  
   
    public void verifyUser() {  
       System.out.println("Verifying user");  
    }  
 }