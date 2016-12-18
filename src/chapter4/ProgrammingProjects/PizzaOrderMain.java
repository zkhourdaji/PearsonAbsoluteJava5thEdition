package chapter4.ProgrammingProjects;

public class PizzaOrderMain {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza('l',1,0,1),  // Code to create a large pizza, 1 cheese, 1 ham 
				pizza2 = new Pizza('m', 2, 2, 0),
				pizza3 = new Pizza('s', 3,3,3); // Code to create a medium pizza, 2 cheese, 2 pepperoni 
		PizzaOrder order = new PizzaOrder(pizza1, pizza2); // Code to create an order 
		//order.setNumberOfPizzas(2); // 2 pizzas in the order 

		//order.setPizza1(pizza1); // Set first pizza 
		//order.setPizza2(pizza2); // Set second pizza 
		double total = order.calcTotal(); // Should be 18+20 = 38

		System.out.println(total);

		PizzaOrder order1 = new PizzaOrder(order);
		order1.setNumberOfPizzas(3);
		order.setPizza3(new Pizza('S'));
		
		Pizza pizza4 = order.getPizza1();
		pizza4.setPizzaSize('s');
		pizza4.setCheeseToppings(3);
		pizza4.setHamToppings(3);
		pizza4.setPepperoniToppings(3);
		
		System.out.println("Order 1");
		System.out.println(order1);
		System.out.println("Order");
		System.out.println(order);
	}

}
