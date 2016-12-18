package chapter5;

import chapter4.Date;

/**
Class for a person with a name and dates for birth and deaths.
Class invariant: A Person has a date of birth, and if the person has a date of death,
then the death is equal to or later than the date of birth

@author ZaferSamir
@version 1.0
*/


public class Person {

	private String name;
	private Date born;
	private Date died; // null indicates still alive

	
	/**
	 * If birthDate is consistent with deathDate, then
	 * set the name to initName, born to birthDate (using Date's copy constructor)
	 * and set the deathDate (using Date's copy constructor.
	 * deathDate can be null, in this case instance variable died will simply be null.
	 *  
	 * @param initName Name of the person
	 * @param birthDate  Birth date of the person
	 * @param deathDate	Death date of the person
	 */
	public Person(String initName, Date birthDate, Date deathDate) {

		if (consistent(birthDate, deathDate)){
			name = initName;
			born = new Date(birthDate);
			if (deathDate == null)
				died = null;
			else
				died = new Date (deathDate);
		}
		else
		{
			System.out.println("Inconsistent dates. Aborthing");
			System.exit(0);
		}

	}

	/**
	 * if original is null, this copy constructor will print an error message and exit.
	 * 
	 * sets name to the original person's name
	 * sets the born date to the original person's born date (using the Date copy constructor)
	 * sets the death date to the original person's death date (using the Date copy constructor)
	 * 
	 * the death date of the original person can be null, in this case the new person's death date
	 * will simply be null
	 * 
	 * @param original Person object to be copied
	 */
	public Person(Person original) {

		if (original == null){
			System.out.println("Fatal Error.");
			System.exit(0);
		}

		name = original.name;
		born = new Date(original.born);

		if (original.died == null)
			died = null;
		else
			died = new Date(original.died);
	}


	/**
	 * returns a string the person name, born date, and death date.
	 */
	public String toString(){

		String diedString;
		if (died == null)
			diedString = "";
		else
			diedString = died.toString();

		return (name + ", " + born + "-" + diedString);

	}

	/**
	 * Two person's are considered equal, when they match names, and born dates and death dates.
	 * 
	 * @param otherPerson Person to compare to
	 * @return true if the persons are equal and false if they're not.
	 */
	public boolean equals(Person otherPerson){
		if (otherPerson == null)
			return false;
		else
			return (name.equals(otherPerson.name)
					&& born.equals(otherPerson.born)
					&& datesMatch(died, otherPerson.died));
	}

	/**
	 * to match, date1 and date2 must either be the same date or must both be null.
	 */
	private static boolean datesMatch(Date date1, Date date2){

		if (date1 == null)
			return (date2 == null);
		else if (date2 == null) // && date1 != null
			return false;
		else // both dates are null
			return (date1.equals(date2));
	}

	/**
	 * Precondition: newDate is a consistent date of birth.
	 * Postcondition: Date of birth of the calling object is newDate;
	 * 
	 * @param newDate a birth date
	 */
	public void setBirthDate(Date newDate){

		if (consistent(newDate, died))
			born = new Date(newDate);
		else
		{
			System.out.println("Inconsistent dates. Aborthing.");
			System.exit(0);
		}
	}

	/**
	 * Precondition: newDate is a consistent date of death.
	 * Postcondition: Date of death of the calling object is newDate;
	 * 
	 * @param newDate a death date
	 */
	public void setDeathDate(Date newDate){

		if (!consistent(born, newDate)){
			System.out.println("Inconsistent dates. Aborting");
			System.exit(0);
		}
		
		if (newDate == null)
			died = null;
		else
			died = new Date(newDate);
	}

	/**
	 * Set's the person's name to newName
	 * 
	 * @param newName new name to be assigned to the person's name
	 */
	public void setName(String newName){

		this.name = newName;
	}

	/**
	 * Precondition: the date of birth has been set, and changing the year
	 * part of the date of birth will give a consistent date of birth.
	 * PostCondition: the year of birth is (changed to) new year
	 * 
	 * @param newYear birth year
	 */
	
	public void setBirthYear(int newYear){

		if (born == null){
			System.out.println("Fatal Error. Aborting");
			System.exit(0);
		}
		born.setYear(newYear);
		if (!consistent(born, died)){
			System.out.println("Inconsistent dates. Aborthing");
			System.exit(0);
		}
	}

	
	/**
	 * Precondition: the date of death has been set, and changing the year
	 * part of the date of death will give consistent date of death.
	 * PostCondition: the year of death is (changed to) new year
	 * 
	 * @param newYear death year
	 */
	
	public void setDeathYear(int newYear){

		if (died == null){
			System.out.println("Fatal Error. Aborting.");
			System.exit(0);
		}
		died.setYear(newYear);
		if (!consistent(born, died)){
			System.out.println("Inconsistent dates. Aborthing");
			System.exit(0);
		}
	}

	/**
	 * 
	 * @return the name of the person
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * this method returns the birth date of the person using the Date's copy constructor.
	 * saving the reference to the returned object and modifying any data 
	 * wont affect the original person's data.
	 * 
	 * @return the birth date of the person.
	 */
	public Date getBirthDate(){
		return new Date(born);
	}

	/**
	 * this method returns the death date of the person using the Date's copy constructor.
	 * saving the reference to the returned object and modifying any data
	 * wont affect the original person' data.
	 * @return the death date of the person.
	 */
	public Date getDeathDate(){
		if (died == null)
			return null;
		else 
			return new Date(died);
	}

	/**
	 * To be consistent, birthDate must not be null. If there is no date of
	 * death (deathDate == null), that is consistent with any birthDate.
	 * Otherwise, the birthDate must come before or equal to the deathDate.
	 */
	private static boolean consistent(Date birthDate, Date deathDate){

		if (birthDate == null)
			return false;
		else if (deathDate == null)
			return true;
		else
			return (birthDate.precedes(deathDate) 
					|| birthDate.equals(deathDate));
	}


}













