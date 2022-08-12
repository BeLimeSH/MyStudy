package edu.kh.jdbc.restaurant.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.member.model.vo.Member;
import edu.kh.jdbc.order.model.vo.Order;
import edu.kh.jdbc.restaurant.model.vo.Restaurant;

public class RestaurantDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public RestaurantDAO() {
		
		try {
			prop = new Properties();
			
			prop.loadFromXML(new FileInputStream("restaurant-sql.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/** 식당 메뉴 조회 DAO
	 * @param restaurantNo
	 * @param conn
	 * @return restaurantList
	 * @throws Exception
	 */
	public List<Restaurant> selectAll(Connection conn, int restaurantNo) throws Exception {
		
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		
		try {
			String sql = prop.getProperty("select" + restaurantNo);
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int menuNo			= rs.getInt("MENU_NO");
				String menuName		= rs.getString("MENU_NM");
				String toCharPrice	= rs.getString("TO_CHAR_PRICE"); 
				
				Restaurant restaurant = new Restaurant(menuNo, menuName, toCharPrice);
				
				restaurantList.add(restaurant);
			}
			
		} finally {
			close(rs);
			close(stmt);
		}
		return restaurantList;
	}

	/** 메뉴 주문 DAO
	 * @param conn
	 * @param restaurantNo
	 * @param chooseMenu
	 * @param numberOfMenu
	 * @param loginMember
	 * @return result
	 * @throws Exception
	 */
	public int insertOrder(Connection conn, int restaurantNo, int chooseMenu, int numberOfMenu, Member loginMember) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("insertOrder");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, loginMember.getMemberNo());
			pstmt.setInt(2, restaurantNo);
			pstmt.setInt(3, chooseMenu);
			pstmt.setInt(4, numberOfMenu);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	/** 주문 내역 조회 DAO
	 * @param conn
	 * @param loginMember
	 * @param i
	 * @return order
	 * @throws Exception
	 */
	public List<Order> selectOrder(Connection conn, Member loginMember, int i) throws Exception {
		
		List<Order> orderList = new ArrayList<Order>();
		
		try {
			String sql = prop.getProperty("selectOrder" + i);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, loginMember.getMemberNo());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int orderNo			= rs.getInt("ORDER_NO");
				String menuName		= rs.getString("MENU_NM");
				int numberOfMenu	= rs.getInt("NUMBER_OF_MENU");
				String toCharPrice	= rs.getString("TCP");
				String pn			= rs.getString("PN");
				String toCharTime	= rs.getString("TOCHARTIME");
				int price			= rs.getInt("P");
				
				Order order = new Order(orderNo, menuName, numberOfMenu, toCharPrice, pn, toCharTime, price);
				
				orderList.add(order);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		return orderList;
	}

	/** 주문 취소 DAO
	 * @param conn
	 * @param memberNo
	 * @param cancleNum
	 * @return result
	 * @throws Exception
	 */
	public int deleteOrder(Connection conn, int memberNo, int cancleNum) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("deleteOrder");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			pstmt.setInt(2, cancleNum);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 주문 수령 확인 DAO
	 * @param conn
	 * @param memberNo
	 * @param checkNum
	 * @return result
	 * @throws Exception
	 */
	public int checkOrder(Connection conn, int memberNo, int checkNum) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("checkOrder");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			pstmt.setInt(2, checkNum);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 수령 완료 내역 조회 DAO
	 * @param conn
	 * @param loginMember
	 * @param i
	 * @return orderList
	 * @throws Exception
	 */
	public List<Order> selectCompleteOrder(Connection conn, Member loginMember, int i) throws Exception {
		
		List<Order> orderList = new ArrayList<Order>();
		
		try {
			String sql = prop.getProperty("selectCompleteOrder" + i);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, loginMember.getMemberNo());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String restaurantName = rs.getString("RESTAURANT_NM");
				int orderNo			= rs.getInt("ORDER_NO");
				String menuName		= rs.getString("MENU_NM");
				String toCharTime	= rs.getString("TOCHARTIME");
				char reviewYN		= rs.getString("REVIEW_YN").charAt(0);
				
				Order order = new Order(orderNo, menuName, toCharTime, restaurantName, reviewYN);
						
				orderList.add(order);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		return orderList;
	}
}
