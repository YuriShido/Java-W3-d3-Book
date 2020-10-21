public class Student {
	//Instance variables
	private String firstName;
	private String lastName;
	
    
    //Default Constructor
    public Student(String fName, String lName) {
    	if (fName == "") {
    		firstName = "Unknown";  		
    		
    	} else {
    		firstName  = fName;
    		
    	}
    	if (lName == "") {
    		lastName = "Unknown";  		
    		
    	} else {
    		lastName  = lName;
    		
    	}

    }
    
    /*
     * @return first name 
     */
    public String getFirstName() {
    	return firstName;
    }
    
    /*
     * @ return last name
     */
    public String getLastName() {
    	return lastName;
    }
    
    public void setFirstName(String fName) {
    	if (fName == "" || fName == null) {
    		firstName = "Unknown";  		
    		
    	} else {
    		firstName  = fName;
    		
    	}
    }
 
}