
public class Book {
    private String title;
    private String firstnameAuthor;
    private String lastnameAuthor;
    private int year;
    

	public Book (String bookTitle, String firstNAu, String lastNAu, int yearOfBook) {
		if(bookTitle == "") {
			title = "Unknown";	
		} else {
			title = bookTitle;
		}
		
		if(firstNAu == "") {
			firstnameAuthor = "Jhon";	
		} else {
			firstnameAuthor = firstNAu;
		}
		
		if(lastNAu == "") {
			lastnameAuthor = "Dow";	
		} else {
			lastnameAuthor = lastNAu;
		}
		
		if(yearOfBook < 1990) {
			year = 1990;	
		} else {
			year = yearOfBook;
			
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getfirstnameAuthor() {
		return firstnameAuthor;
	}
	
	public String getlastnameAuthor() {
		return lastnameAuthor;
	}
	
	public int getyear() {
		return year;
	}
	public void setTitle(String bookTitle) {
		if(bookTitle == "") {
			title = "Unknown";	
		} else {
			title = bookTitle;
		}
	}
	
	public void setFirstname(String firstNAu) {
		if(firstNAu == "") {
			firstnameAuthor = "Jhon";	
		} else {
			firstnameAuthor = firstNAu;
		}
	}
	
	public void setLastName(String lastNAu) {
		if(lastNAu == "") {
			lastnameAuthor = "Dow";	
		} else {
			lastnameAuthor = lastNAu;
		}
	}
	
	public void setYear(int yearOfBook) {
		if(yearOfBook < 1990) {
			year = 1990;	
		} else {
			year = yearOfBook;
			
		}
	}
	
}

