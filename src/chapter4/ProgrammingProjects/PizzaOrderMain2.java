package chapter4.ProgrammingProjects;

public class PizzaOrderMain2 {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza('l', 1, 0, 1);
		Pizza pizza2 = new Pizza('m', 2, 2, 0);
		PizzaOrder order1 = new PizzaOrder(pizza1, pizza2);
		
		double total = order1.calcTotal();
		PizzaOrder order2 = new PizzaOrder(order1);
		System.out.println(total);
		
		order2.getPizza1().setCheeseToppings(3);
		total = order2.calcTotal();
		System.out.println(total);
		double originalTotal = order1.calcTotal();
		System.out.println(originalTotal);
	}

}
