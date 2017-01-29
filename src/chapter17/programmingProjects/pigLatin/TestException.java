package chapter17.programmingProjects.pigLatin;

public class TestException {
	
	public static void main(String[] args) {
		
		Word ball = null, button = null, 
				all = null, one = null;
		
		try {
			ball = new Word("ball");
			button = new Word("button");
			all = new Word("all");
			one = new Word("one");
		} catch (BadWordException e) {
			System.out.println(e.getMessage());
		}
		
		Word[] words = {ball, button, all, one};
		
		for (Word word : words){
			System.out.println(word.translteToPigLatin());
		}
		
		
	}

}
