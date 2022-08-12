package edu.kh.jdbc.order.model.vo;

import java.sql.Date;

public class Order {

	//주문 내역
//ORDER_NO, MENU_NM, NUMBER_OF_MENU, PRICE, PRICE*NUMBER_OF_MENU PN, ORDER_TIME
	
	//필드
	private int orderNo;
	private String menuName;
	private int numberOfMenu;
	private String toCharPrice;
	private String pn;
	private Date orderTime;
		
	private int menuNo;
	private int price;
	
	private String toCharTime;
	private String restaurantName;
	private char reviewYN;
	
	//생성자
	public Order() {}
	
	public Order(int orderNo, String menuName, int numberOfMenu, String toCharPrice, String pn, String toCharTime, int price) {
		super();
		this.orderNo = orderNo;
		this.menuName = menuName;
		this.numberOfMenu = numberOfMenu;
		this.toCharPrice = toCharPrice;
		this.pn = pn;
		this.toCharTime = toCharTime;
		this.price = price;
	}
	
	public Order(int orderNo, String menuName, String toCharTime, String restaurantName, char reviewYN) {
		super();
		this.orderNo = orderNo;
		this.menuName = menuName;
		this.toCharTime = toCharTime;
		this.restaurantName = restaurantName;
		this.reviewYN = reviewYN;
	}

	//getter / setter

	public int getOrderNo() {
		return orderNo;
	}

	public String getToCharPrice() {
		return toCharPrice;
	}

	public void setToCharPrice(String toCharPrice) {
		this.toCharPrice = toCharPrice;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}

	public int getNumberOfMenu() {
		return numberOfMenu;
	}

	public void setNumberOfMenu(int numberOfMenu) {
		this.numberOfMenu = numberOfMenu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getToCharTime() {
		return toCharTime;
	}

	public void setToCharTime(String toCharTime) {
		this.toCharTime = toCharTime;
	}

	public char getReviewYN() {
		return reviewYN;
	}

	public void setReviewYN(char reviewYN) {
		this.reviewYN = reviewYN;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
}
