package readingfile;
import java.io.*;
public class FilterInputStreams {
public static void main(String[] ard)
{
	try
	{
		File f=new File("D:\\Project Backups\\New Text Document.txt");
		FileInputStream fin=new FileInputStream(f);
		FilterInputStream ffin=new FilterInputStream(fin) {};
		int x;
		while((x=ffin.read())!=-1)
		{
			char ch=(char)x;
			System.out.print(ch);
		}
		ffin.close();
		fin.close();
	}
	catch(Exception obj)
	{
		obj.printStackTrace();
	}
}
}
