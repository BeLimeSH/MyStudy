package edu.kh.jdbc.restaurant.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.member.model.vo.Member;
import edu.kh.jdbc.order.model.vo.Order;
import edu.kh.jdbc.restaurant.model.dao.RestaurantDAO;
import edu.kh.jdbc.restaurant.model.vo.Restaurant;

public class RestaurantService {
	
	private RestaurantDAO dao = new RestaurantDAO();

	/** 식당 메뉴 조회 Service
	 * @param restaurantNo
	 * @return restaurantList
	 * @throws Exception
	 */
	public List<Restaurant> selectAll(int restaurantNo) throws Exception {
		
		Connection conn = getConnection();
		
		List<Restaurant> restaurantList = dao.selectAll(conn, restaurantNo);
		
		close(conn);
		
		return restaurantList;
	}

	/** 메뉴 주문 Service
	 * @param restaurantNo
	 * @param chooseMenu
	 * @param numberOfMenu
	 * @param loginMember
	 * @return result
	 * @throws Exception
	 */
	public int insertOrder(int restaurantNo, int chooseMenu, int numberOfMenu, Member loginMember) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.insertOrder(conn, restaurantNo, chooseMenu, numberOfMenu, loginMember);
		
		if(result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 주문 내역 조회 Service
	 * @param loginMember
	 * @return restaurant
	 * @throws Exception
	 */
	public List<Order> selectOrder(Member loginMember, int i) throws Exception {
		
		Connection conn = getConnection();
		
		List<Order> orderList = dao.selectOrder(conn, loginMember, i);
		
		close(conn);
		
		return orderList;
	}

	/** 주문 취소 Service
	 * @param memberNo
	 * @param cancleNum
	 * @return result
	 * @throws Exception
	 */
	public int deleteOrder(int memberNo, int cancleNum) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.deleteOrder(conn, memberNo, cancleNum);
		
		if (result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 주문 수령 확인 Service
	 * @param memberNo
	 * @param checkNum
	 * @return result
	 * @throws Exception
	 */
	public int checkOrder(int memberNo, int checkNum) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.checkOrder(conn, memberNo, checkNum);
		
		if (result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 수령 완료 내역 조회 Service
	 * @param loginMember
	 * @param i
	 * @return orderList
	 * @throws Exception
	 */
	public List<Order> selectCompleteOrder(Member loginMember, int i) throws Exception {
		
		Connection conn = getConnection();
		
		List<Order> orderList = dao.selectCompleteOrder(conn, loginMember, i);
		
		close(conn);
		
		return orderList;
	}


	
	
	
	
	
	
	
}
