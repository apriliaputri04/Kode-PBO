package UTS.Soal3;

public class Customer extends User {  
    private boolean verificationStatus;  
   
    public Customer(int userId, String password, boolean verificationStatus) {  
       super(userId, password);  
       this.verificationStatus = verificationStatus;  
    }  
   
    public boolean getVerificationStatus() {  
       return verificationStatus;  
    }  
   
    public void applyVerification(String ssn, String drv, String prof) {  
       System.out.println("Verification process");  
    }  
 }  
   