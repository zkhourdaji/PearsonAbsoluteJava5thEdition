package chapter17.programmingProjects.pigLatin;

public class BadWordException extends Exception {
	
	private String badWord;
	
	
	public BadWordException() {
		super("InvalidWordException");
	}
	
	public BadWordException(String badWord){
		super ("Invalid Word: " + badWord);
		this.badWord = badWord;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	public String getBadWord() {
		return badWord;
	}

}
