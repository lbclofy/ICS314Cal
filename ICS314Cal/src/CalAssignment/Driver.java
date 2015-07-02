package CalAssignment;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Driver Class 
 * Making a CalObj and writing toString to file for testing purposes.
 * NOT FINAL CODE. Please change or refactor as needed.
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		CalObj event1 = new CalObj();
		event1.setName("Fireworks");
		event1.setStartTime("20150704T210000");
		event1.setEndTime("20150704T220000");
		event1.setTimezone("Pacific/Honolulu");
		event1.setSummary("Watching fireworks at Ala Moana.");
		
		try
		{
			//creating file
			File writeF = new File("testCal.ics");
			
			if (!writeF.exists())
			{
				writeF.createNewFile();
			}
			
			//setting up write buffer
			FileWriter fw = new FileWriter(writeF.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			//writing event1
			bw.write(event1.toString());
			
			bw.close();
			
			System.out.println("file written");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}