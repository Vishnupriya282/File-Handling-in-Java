package writingfile;

import java.io.*;

public class BufferedOutputStreams {
	public static void main(String[] argw)
    {
		 try {
				File f=new File("D:\\Project Backups\\write1.txt");
				FileOutputStream fout=new FileOutputStream(f);
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				String msg="Welcome to File Handling in java \n IT'S BUFFERED CLASS";
				byte[] by=msg.getBytes();
				bout.write(by);
				bout.close();
				fout.close();
				System.out.println("Success");
				
		 }
		 catch(Exception e)
			{
				e.printStackTrace();
			}
}
}