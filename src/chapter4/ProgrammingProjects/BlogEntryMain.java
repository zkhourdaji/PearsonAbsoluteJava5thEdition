package chapter4.programmingProjects;

import chapter4.Date;

public class BlogEntryMain {

	public static void main(String[] args) {

		String text1 = "this is my text that has more than ten words for sure because its super long and long";
		Date myDate = new Date(11, 17, 2016);
		BlogEntry firstBlog = new BlogEntry("Zafer", text1 , myDate);
		
		
		firstBlog.displayEntry();
		System.out.println(firstBlog.getSummary());

	}

}
