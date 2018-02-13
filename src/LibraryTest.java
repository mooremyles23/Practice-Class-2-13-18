import java.util.Scanner;
public class LibraryTest {
	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your location, totalbooks, totalstaff, and yearlyexpenses");	
	
	Library Library1= new Library(scan.nextLine(), scan.nextInt(), scan.nextInt(),scan.nextDouble()); scan.nextLine();
	System.out.println("Please enter your location, totalbooks, totalstaff, yearlyexpenses");
	
	Library Library2= new Library(scan.nextLine(), scan.nextInt(), scan.nextInt(),scan.nextDouble()); scan.nextLine();
	System.out.println("Please enter your location, totalbooks, totalstaff, yearlyexpenses");
		
	Library Library3= new Library(scan.nextLine(), scan.nextInt(), scan.nextInt(),scan.nextDouble()); scan.nextLine();
	System.out.println("Please enter your location, totalbooks, totalstaff, yearlyexpenses");	
	
	Library Library4= new Library(scan.nextLine(), scan.nextInt(), scan.nextInt(),scan.nextDouble()); scan.nextLine();
	System.out.println("Please enter your location, totalbooks, totalstaff, yearlyexpenses");	
	
	System.out.print(Library1.location);
	System.out.print(Library1.totalbooks);	
	System.out.print(Library1.totalstaff);			
	System.out.print(Library1.yearlyexpenses);
	
	System.out.print(Library2.location);
	System.out.print(Library2.totalbooks);	
	System.out.print(Library2.totalstaff);			
	System.out.print(Library2.yearlyexpenses);
	
	System.out.print(Library3.location);
	System.out.print(Library3.totalbooks);	
	System.out.print(Library3.totalstaff);			
	System.out.print(Library3.yearlyexpenses);
	
	System.out.print(Library4.location);
	System.out.print(Library4.totalbooks);	
	System.out.print(Library4.totalstaff);			
	System.out.print(Library4.yearlyexpenses);
	
	
	
	
		
		
	}
}
