package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private LocalDate manufactureDate;
	
	private static final DateTimeFormatter FORMATTER_BR =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, double price, String data) {
		super(name, price);
		manufactureDate = LocalDate.parse(data, FORMATTER_BR);
	}

	public String getManufactureDate() {
		return this.manufactureDate.format(FORMATTER_BR);
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + getManufactureDate() + ")";
	}

}
