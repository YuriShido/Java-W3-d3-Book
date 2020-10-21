public class Student {
	//Instance variables
	private String firstName;
	private String lastName;
	private double score;
	
    
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
    	this.score = 0;

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
    
    public double getScore() {
    	return this.score;
    }
    
    public void setFirstName(String fName) {
    	if (fName == "" || fName == null) {
    		firstName = "Unknown";  		
    		
    	} else {
    		firstName  = fName;
    		
    	}
    }
    
    public void setScore(double score) {
    	this.score = score;
    }
    
 
}