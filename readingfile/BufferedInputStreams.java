package readingfile;
import java.io.*;
public class BufferedInputStreams {
public static void main(String[] args)
{
	try {
    File f=new File("D:\\Project Backups\\write1.txt");
    FileInputStream fin=new FileInputStream(f);
    BufferedInputStream bin=new BufferedInputStream(fin);
    int x;
    while((x=bin.read())!=-1)
    {
    	char ch=(char) x;
    	System.out.print(ch);
    }
    bin.close();
    fin.close();
    
    
} 
	catch(Exception obj)
	{
		obj.printStackTrace();
	}
}
}
