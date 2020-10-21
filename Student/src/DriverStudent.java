public class DriverStudent {
	
	public static void printStudents(Student[] studArray) {
		for(int i=0; i <studArray.length; i++) {
			System.out.println(studArray[i].getFirstName() + " " + studArray[i].getLastName() + " -Score : " + studArray[i].getScore());
		}
		
	}

	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		
		
		studentArray[0] = new Student("", "");
		studentArray[1] = new Student("Jane", "Dew");
		studentArray[2] = new Student("Albert", "Dao");
		
		studentArray[0].setFirstName("jhon");
		
		//Update the score
		studentArray[0].setScore(19.2);
		studentArray[1].setScore(18.5);
		studentArray[2].setScore(20);
		
		
		
//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() +  " " + student2.getLastName());
//		System.out.println(student3.getFirstName() + " " + student3.getLastName());
		printStudents(studentArray);
	}

}
