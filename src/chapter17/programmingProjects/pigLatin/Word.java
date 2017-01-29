package chapter17.programmingProjects.pigLatin;

public class Word {

	
	private String englishWord;
	
	
	public Word (String englishWord) throws BadWordException {
		
		for (int i = 0; i < englishWord.length(); i++){
			
			char c = englishWord.charAt(i);
			
			if (!Character.isLetter(c)){
				throw new BadWordException(englishWord);
			}
		}
		
		this.englishWord = englishWord;
		
		
	}
	
	public String translteToPigLatin(){
		
		char firstLetter = this.englishWord.charAt(0);
		String pigLatinWord = "";
		
		if (this.isVowel(firstLetter)){
			pigLatinWord += this.englishWord + "way";
		}
		else{
			pigLatinWord += this.englishWord.substring(1);
			pigLatinWord += firstLetter + "ay";
		}
		
		return pigLatinWord;
		
	}
		
	private boolean isVowel(char c){
		return "AEIOUaeiou".indexOf(c) != -1;
	}
	
	public String getWord() {
		return englishWord;
	}
	
	@Override
	public String toString() {
		return this.englishWord;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null){
			return false;
		}
		else if (obj.getClass() != this.getClass()){
			return false;
		}
		else {
			
			Word otherWord = (Word) obj;
			
			return this.englishWord.equals(otherWord);
		}
	}
	
}
