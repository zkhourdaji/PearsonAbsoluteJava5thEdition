package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryInputDemo {

	public static void main(String[] args) {

		try {
			ObjectInputStream inputStream =
					new ObjectInputStream(
							new FileInputStream("numbers.dat"));
			System.out.println("reading the file numbers.dat");

			int n1 = inputStream.readInt();
			int n2 = inputStream.readInt();
			System.out.println(n1);
			System.out.println(n2);
			inputStream.close();

		} catch (FileNotFoundException e) {
			System.out.println("cannot find file numbers.dat");
			
		} catch (IOException e) {
			System.out.println("problem with input from numbers.dat");
		}
		System.out.println("end of program");
	}

}
