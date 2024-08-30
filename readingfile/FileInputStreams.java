package readingfile;
import java.io.*;
public class FileInputStreams {
public static void main(String[] args)
{
	try
	{
		File f=new File("D:\\Project Backups\\write1.txt");
		FileInputStream fin=new FileInputStream(f);
		int x;
		while((x=fin.read())!=-1)
		{
			char ch=(char)x;
			System.out.print(ch);
		}
		fin.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
}
}
