package chapter6.ProgrammingProjects;

public class DeleteRepeats {

	public static void main(String[] args) {

		char[] charArray = new char[10];
		int numberUsed = 0;

		charArray[0] = 'a';
		charArray[1] = 'a';
		charArray[2] = 'd';
		charArray[3] = 'c';
		charArray[4] = 'd';
		charArray[4] = 'p';
		charArray[5] = 'z';


		for (int i = 0; i < charArray.length; i++){
			if (charArray[i] != 0)
				numberUsed ++;
		}


		numberUsed = deleteRepeats(charArray, numberUsed);

		System.out.println("new number used " + numberUsed);
		for (int i = 0; i < numberUsed; i ++)
			System.out.println(i + ": " + charArray[i]);

	}


	/**
	 * deletes duplicate elements in the character array, and shifts the 
	 * elements so there is no gaps between them.
	 * 
	 * @param partiallyFilledArray array character
	 * @param numberUsed the number of elements in the array
	 * 
	 * @return the new number of elements in the array after deleting duplicates
	 */
	public static int deleteRepeats (char[] partiallyFilledArray, int numberUsed){

		for (int i = 0; i < numberUsed; i++){


			for (int j = 0; j < numberUsed; j++){

				if ((i != j) 
						&& partiallyFilledArray[i] != 0
						&& partiallyFilledArray[i] == partiallyFilledArray[j]){
					//System.out.println("deleting: " + partiallyFilledArray[j]);
					partiallyFilledArray[j] = '\u0000'; // null equivalent for chars
				}
			}
		}

		boolean arrayGood = false;
		
		while (!arrayGood){
			
			for (int i = 0; i < numberUsed; i++){

				try{
					if (partiallyFilledArray[i] == 0){
						partiallyFilledArray[i] = partiallyFilledArray[i+1];
						partiallyFilledArray[i+1] = 0;
					}
				}
				catch(Exception e){
					System.out.println("exception");

				}

			}
			
			int firstEmptyCharIndex = 0;
			int lastFilledCharIndex = 0;
			
			boolean firstEmptyIndexFound = false;
			
			for (int i = 0; i < numberUsed; i ++){
				
				if (!firstEmptyIndexFound && partiallyFilledArray[i] == 0){
					firstEmptyIndexFound = true;
					firstEmptyCharIndex = i;
					//System.out.println("first empty index " + firstEmptyCharIndex);
				}
				
				if (partiallyFilledArray[i] != 0){
					lastFilledCharIndex = i;
					//System.out.println("last filled char index " + lastFilledCharIndex);
				}
			}
			
			if (firstEmptyCharIndex > lastFilledCharIndex){
				arrayGood = true;
			}
				
		}

		int newNumberUsed = 0;


		for (int i = 0; i < numberUsed; i++){
			if (partiallyFilledArray[i] != 0)
				newNumberUsed ++;
		}

		// returns the number used after deleting duplicates
		return newNumberUsed;

	}

}
