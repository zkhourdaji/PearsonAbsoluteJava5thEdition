package chapter10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {

		try {
			RandomAccessFile ioStream =
					new RandomAccessFile("bytedata", "rw");

			System.out.println("Writing 3 bytes to the file bytedata");
			ioStream.writeByte(1);
			ioStream.writeByte(2);
			ioStream.writeByte(3);
			System.out.println("the length of the file is now = " + 
					ioStream.getFilePointer());
			System.out.println("moving the file pointer to location 1");
			ioStream.seek(1);
			byte oneByte = ioStream.readByte();
			System.out.println("the value at location 1 is " + oneByte);
			oneByte = ioStream.readByte();
			System.out.println("the value at the next location is " + oneByte);
			
			System.out.println("now we move the pointer location back to"
					+ " 1 and change the byte.");
			ioStream.seek(1);
			ioStream.writeByte(9);
			ioStream.seek(1);
			oneByte = ioStream.readByte();
			System.out.println("the value at location 1 is now " + oneByte);
			
			System.out.println("now we go to the end of the file");
			System.out.println("and write a double");
			
			ioStream.seek(ioStream.length());
			ioStream.writeDouble(41.99);
			System.out.println("the length of the file is now " + ioStream.length());
			
			System.out.println("returning to location 3, where we wrote the double");
			ioStream.seek(3);
			double oneDouble = ioStream.readDouble();
			System.out.println("the double value at location 3 is " + oneDouble);
			
			ioStream.close();
			

		} catch (FileNotFoundException e) {
			System.out.println("problem opening file");
		}
		catch(IOException e){
			System.out.println("problems with file I/O");
		}
		System.out.println("End of program");

	}

}
