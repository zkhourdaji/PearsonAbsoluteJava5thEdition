package chapter7.ProgrammingProjects;

public class Email extends Document {

	
	private String sender;
	private String receiver;
	private String title;
	private String emailMessage;
	
	public Email(String sender, String receiver, String title, String emailMessage) {
		
		super(emailMessage);
		this.sender = sender;
		this.receiver = receiver;
		this.title = title;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	
	@Override
	public String toString() {
		return "Sender: " + this.sender + "\n"
				+ "Receiver: " + this.receiver + "\n"
				+ "Title: " + this.title + "\n"
				+ "Message: " + super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (this.getClass() != obj.getClass())
			return false;
		else{
			Email otherEmail = (Email) obj;
			return (super.equals(otherEmail)
					&& this.sender.equalsIgnoreCase(otherEmail.sender)
					&& this.receiver.equalsIgnoreCase(otherEmail.receiver)
					&& this.title.equalsIgnoreCase(otherEmail.title));
		}
	}
	
	
}
