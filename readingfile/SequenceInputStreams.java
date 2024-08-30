package readingfile;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
public class SequenceInputStreams {
	public static void main(String[] arg)
	{
		try
		{
			File f1=new File("D:\\Project Backups\\New Text Document.txt");
			File f2=new File("D:\\Project Backups\\write1.txt");
			
			FileInputStream fin1=new FileInputStream(f1);
			BufferedInputStream bis1=new BufferedInputStream(fin1);
			
			FileInputStream fin2=new FileInputStream(f2);
			BufferedInputStream bis2=new BufferedInputStream(fin2);
			
			Vector<BufferedInputStream> v=new Vector<BufferedInputStream>();
			v.add(bis1);
			v.add(bis2);
			Enumeration<BufferedInputStream> e=v.elements();
			SequenceInputStream sis=new SequenceInputStream(e);
			int x;
			while((x=sis.read())!=-1)
			{
				char ch=(char) x;
				System.out.print(ch);
			}
			sis.close();
			fin1.close();
			fin2.close();
			
		}
		catch(Exception obj)
		{
			obj.printStackTrace();
		}
	}
}
