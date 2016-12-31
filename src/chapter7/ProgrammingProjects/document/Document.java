package chapter7.programmingProjects.document;

public class Document {
	
	private String text;
	
	
	public Document(String text) {
		
		this.text = text;
	}
	
	public Document() {
		this.text = "";
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (this.getClass() != obj.getClass())
			return false;
		else{
			Document otherDocument = (Document) obj;
			return (this.text.equalsIgnoreCase(otherDocument.text));
		}
	}
	

}
