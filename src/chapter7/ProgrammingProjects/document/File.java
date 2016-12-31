package chapter7.programmingProjects.document;

public class File extends Document {
	
	private String pathName;
	
	public File(String path, String text) {
		
		super(text);
		this.pathName = path;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pathName + "\n" +  super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		else if (this.getClass() != obj.getClass())
			return false;
		else{
			File otherFile = (File) obj;
			return (super.equals(otherFile)
					&& this.pathName.equalsIgnoreCase(otherFile.pathName));
			
			
		}
	}
	

}
