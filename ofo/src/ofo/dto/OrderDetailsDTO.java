package ofo.dto;

public class OrderDetailsDTO {

		int order_id;
		String customer_id;
		String food_id;
		int quantity;
		double price;
		
		
		public int getOrder_id() {
			return order_id;
		}
		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}
		public String getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(String customer_id) {
			this.customer_id = customer_id;
		}
		public String getFood_id() {
			return food_id;
		}
		public void setFood_id(String food_id) {
			this.food_id = food_id;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
}
