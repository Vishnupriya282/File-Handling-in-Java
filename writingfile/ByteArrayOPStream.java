package writingfile;
import java.io.*;
public class ByteArrayOPStream {
public static void main(String[] args)
{
	try
	{
		File f1=new File("D:\\Project Backups\\New Text Document.txt");
		File f2=new File("D:\\Project Backups\\write1.txt");
		FileOutputStream fout1=new FileOutputStream(f1);
		FileOutputStream fout2=new FileOutputStream(f2);
		ByteArrayOutputStream bis=new ByteArrayOutputStream();
		String msg="Yes, Iam displaying in both the files";
		byte[] by=msg.getBytes();
		bis.write(by);
		bis.writeTo(fout1);
		bis.writeTo(fout2);
		bis.close();
		fout1.close();
		fout2.close();
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
	System.out.println("success");
}
}
