package application;

import java.util.Date;

import entities.Orders;
import entities.enums.OrderStatus;
  	
public class EnumExample {

	
	// orders = entidade que possui id, data e status
	// OrderStatus = enum que possui os status (enum = constantes numeradas)
	public static void main(String[] args) {
		Orders orders = new Orders(1080, new Date(), OrderStatus.APROVADO);
		System.out.println(orders);
	}
}
