import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class CustomerDetails {
	public CustomerDetails(String name,String gmail,String age,String rating,String feedback) {
		String filename = name + ".txt" ;
		try {
		      File myObj = new File(filename);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      FileWriter myWriter = new FileWriter(filename);
			  myWriter.write("Name : " + name +"\n" + "Gmail : " + gmail + "\n" + "Age : " + age+ "\n" + "Rating " + rating + "\n  " +"Feedback : " + feedback );
		      myWriter.close();
				
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
}
