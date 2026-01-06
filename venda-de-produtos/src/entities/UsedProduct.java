package entities;

import java.time.Instant;

public class UsedProduct extends Product {
	
	private Instant manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, double price, LocalDateTime data) {
		super(name, price);
		// TODO Converter localdatetime pra instant é o padrão de projeto
	}

}
