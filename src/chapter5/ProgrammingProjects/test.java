package chapter5.ProgrammingProjects;

public class test {

	
	public static void main(String[] args) {
		Duelist a = new Duelist("a", 1);
		System.out.println(Duelist.getNumberOfAliveDuelists());
		
		int y = Duelist.getNumberOfAliveDuelists();
		y = 0;
		System.out.println(Duelist.getNumberOfAliveDuelists());
	}
	
}
