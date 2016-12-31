package chapter4.programmingProjects;

public class Pizza {

	private char pizzaSize = ' '; //S -> Small M -> Medium L -> Large
	private int cheeseToppings, pepperoniToppings, hamToppings;

	public Pizza(char size, int cheese, int pepperoni, int ham) {

		this.setPizzaSize(size);
		this.setCheeseToppings(cheese);
		this.setPepperoniToppings(pepperoni);
		this.setHamToppings(ham);

	}

	public Pizza(Pizza otherPizza) {
		if (otherPizza != null){
			this.pizzaSize = otherPizza.pizzaSize;
			this.cheeseToppings = otherPizza.cheeseToppings;
			this.pepperoniToppings = otherPizza.pepperoniToppings;
			this.hamToppings = otherPizza.hamToppings;
		}
	}



	public Pizza(char size) {
		this.setPizzaSize(size);

	}
	
	
	public String toString() {
		if (this.pizzaSize == ' ')
			return "No Pizza";
		return "Pizza size " + this.pizzaSize + "\n"
				+ "Cheese Toppings " + this.cheeseToppings + "\n"
				+ "Pepperoni Toppings " + this.pepperoniToppings + "\n"
				+ "Ham Toppings " + this.hamToppings + "\n"
				+ "super to string " + super.toString();
		
	}

	public double calcCost(){

		int pizzaPriceWithoutToppings = 0;

		if (this.pizzaSize == 'S')
			pizzaPriceWithoutToppings = 10;
		else if (this.pizzaSize == 'M')
			pizzaPriceWithoutToppings = 12;
		else if (this.pizzaSize == 'L')
			pizzaPriceWithoutToppings = 14;

		return (pizzaPriceWithoutToppings
				+ ((this.cheeseToppings + this.hamToppings + this.pepperoniToppings) * 2));

	}

	public String getDescription(){
		return "Pizza size: " + this.pizzaSize + "\n"
				+ "Cheese toppings: " + this.cheeseToppings + "\n"
				+ "Pepperoni toppings: " + this.pepperoniToppings + "\n"
				+ "Ham toppings: " + this.hamToppings + "\n"
				+ "Total:  $" + this.calcCost();

	}

	public char getPizzaSize(){
		return this.pizzaSize;

	}

	public void setPizzaSize(char size){

		if (size == 's' || size == 'S')
			this.pizzaSize = 'S';
		else if (size == 'm' || size == 'M')
			this.pizzaSize = 'M';
		else if (size == 'l' || size == 'L')
			this.pizzaSize = 'L';
		else{
			System.out.println("Size invalid. Setting it to defualt Small");
			this.pizzaSize = 'S';
		}
	}

	public int getCheeseToppings(){
		return this.cheeseToppings;

	}

	public void setCheeseToppings(int cheese){
		this.cheeseToppings = cheese;
	}

	public int getPepperoniToppings(){
		return this.pepperoniToppings;

	}

	public void setPepperoniToppings(int pepperoni){
		this.pepperoniToppings = pepperoni;
	}

	public int getHamToppings(){
		return this.hamToppings;

	}

	public int setHamToppings(int ham){
		return this.hamToppings = ham;

	}

}
