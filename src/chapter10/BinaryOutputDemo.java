package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryOutputDemo {

	public static void main(String[] args) {

		try {
			ObjectOutputStream outputStream = 
					new ObjectOutputStream(
							new FileOutputStream("numbers.dat"));

			int i;

			for (i = 0; i < 5; i++){
				outputStream.writeInt(i);
			}
			System.out.println("numbers written to the file numbers.dat");
			outputStream.close();

		} catch (IOException e) {
			System.out.println("problem with file output");		
		}

	}

}
