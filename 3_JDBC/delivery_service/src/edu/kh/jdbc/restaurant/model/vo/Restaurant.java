package edu.kh.jdbc.restaurant.model.vo;

public class Restaurant {
	
	//식당 메뉴
	//RESTAURANT_NO, RESTAURANT_NM, CATEGORY
	private int restaurantNo;
	private String restaurantName;
	private String category;
	
	//각 식당 메뉴
	//MENU_NO, MENU_NM,	PRICE, RESTAURANT_NO	
	private int menuNo;
	private String menuName;
	private int price;
	
	//출력용 가격
	private String toCharPrice;
	
	//리뷰 메뉴	
	
	
	//기본 생성자
	public Restaurant() {}
	
	//매개변수 생성자(메뉴 출력용)
	public Restaurant(int menuNo, String menuName, String toCharPrice) {
		super();
		this.menuNo = menuNo;
		this.menuName = menuName;
		this.toCharPrice = toCharPrice;
	}
	

	//getter / setter
	public int getRestaurantNo() {
		return restaurantNo;
	}

	public void setRestaurantNo(int restaurantNo) {
		this.restaurantNo = restaurantNo;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getToCharPrice() {
		return toCharPrice;
	}

	public void setToCharPrice(String toCharPrice) {
		this.toCharPrice = toCharPrice;
	}
	
	
	

}
