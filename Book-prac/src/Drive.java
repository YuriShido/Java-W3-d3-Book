
public class Drive {
	
	public static void printBook(Book[] Barray) {
		for(int i=0; i <Barray.length; i++) {
			System.out.println("Title :" + Barray[i].getTitle() + " " + "  Author :" + Barray[i].getfirstnameAuthor() + " " + Barray[i].getlastnameAuthor() + " " +  "  Published in : " + Barray[i].getyear() + " " + "Total price is: $" + String.format("%.2f",Barray[i].getFinalScore()));
		}
	}

	private static Object getFinalScore() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		
		 bookArray[0] = new Book("Harry Potter", "", "Rowling", 1998, 10);
		 bookArray[1] = new Book("An intimate Portrait", "Barack", "", 2018, 11);
		 bookArray[2]= new Book("Becoming", "Michelle", "Obama", 2018, 15);
		
		
		System.out.println("Title :" + bookArray[0].getTitle() + "  Author : " + bookArray[0].getfirstnameAuthor() + " " + bookArray[0].getlastnameAuthor() + "  Published in : " + bookArray[0].getyear());
		System.out.println("Title :" + bookArray[1].getTitle() + "  Author : " + bookArray[1].getfirstnameAuthor() + " " + bookArray[1].getlastnameAuthor() + "  Published in : " + bookArray[1].getyear());
		System.out.println("Title :" + bookArray[2].getTitle() + "  Author : " + bookArray[2].getfirstnameAuthor() + " " + bookArray[2].getlastnameAuthor() + "  Published in : " + bookArray[2].getyear());
		
		System.out.println("\nPrinting the Book after the update");
		bookArray[0].setTitle("Fantastic");
		bookArray[0].setFirstname("JK");
		bookArray[1].setLastName("Obama");
		printBook(bookArray);
	}

}
