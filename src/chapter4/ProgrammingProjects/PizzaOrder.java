package chapter4.programmingProjects;

public class PizzaOrder {

	private Pizza pizza1, pizza2, pizza3;
	private int numberOfPizzas;


	
	
	public PizzaOrder(PizzaOrder otherPizzaOrder) {
	
		
		this.numberOfPizzas = otherPizzaOrder.numberOfPizzas;	
		this.pizza1 = new Pizza(otherPizzaOrder.pizza1);
		this.pizza2 = new Pizza(otherPizzaOrder.pizza2);
		this.pizza3 = new Pizza(otherPizzaOrder.pizza3);
	}
	
	
	public PizzaOrder(Pizza pizza1) {

		this.setNumberOfPizzas(1);
		this.setPizza1(pizza1);
	}

	public PizzaOrder(Pizza pizza1, Pizza pizza2) {

		this.setNumberOfPizzas(2);
		this.setPizza1(pizza1);
		this.setPizza2(pizza2);
	}

	public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {

		this.setNumberOfPizzas(3);
		this.setPizza1(pizza1);
		this.setPizza2(pizza2);
		this.setPizza3(pizza3);
	}

	
	public String toString() {
		return "Number of pizzas: " + this.numberOfPizzas + "\n"
				+ "Pizza1: " + this.pizza1 + "\n"
				+ "Pizza2: " + this.pizza2 + "\n"
				+ "Pizza3: " + this.pizza3 + "\n"
				+ "Pizza Order super to string " + super.toString() + "\n";
		
	}
	

	// between 1-3
	public void setNumberOfPizzas(int numberOfPizzas){
		if(numberOfPizzas <= 3 && numberOfPizzas >= 0)
			this.numberOfPizzas = numberOfPizzas;
		else{
			System.out.println("Invalid pizza number");
		}

	}

	public void setPizza1(Pizza pizza1){
		this.pizza1 = pizza1;
	}

	public void setPizza2(Pizza pizza2){
		this.pizza2 = pizza2;
	}

	public void setPizza3(Pizza pizza3){
		this.pizza3 = pizza3;
	}

	public double calcTotal(){

		double totalCost = 0; 

		if (pizza1 != null)
			totalCost += pizza1.calcCost();
		if (pizza2 != null)
			totalCost += pizza2.calcCost();
		if (pizza3 != null)
			totalCost += pizza3.calcCost();

		return totalCost;

	}

	public int getNumPizzas(){
		return this.numberOfPizzas;
	}

	public Pizza getPizza1(){
		return this.pizza1;

	}
	public Pizza getPizza2(){
		return this.pizza2;

	}
	public Pizza getPizza3(){
		return this.pizza3;

	}



}
