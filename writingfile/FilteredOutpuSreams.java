package writingfile;
import java.io.*;

public class FilteredOutpuSreams {
public static void main(String[] args)
{
	try
	{
		
	
	File f=new File("D:\\Project Backups\\write1.txt");
	FileOutputStream fout=new FileOutputStream(f);
	FilterOutputStream fi=new FilterOutputStream(fout);
	String msg="FilterOutputstream is faster than BufferedOutoutStream";
	byte[] by=msg.getBytes();
	fi.write(by);
	fi.close();
	fout.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Success..");
	
}
}
