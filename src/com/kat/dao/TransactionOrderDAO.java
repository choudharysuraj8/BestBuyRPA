package com.kat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kat.bean.TransactionDetail;
import com.kat.bean.TransactionOrder;
import com.kat.db.Database;

public class TransactionOrderDAO {

	private static final String GETTRANSACTIONORDERBYTRANSACTIONDETAILID = "select ORDER_ID, TRANSACTION_DETAIL_ID, URL, ORDER_COUNT, ORDER_PLACED, ORDER_AVAILABLE from tblTransactionOrders where TRANSACTION_DETAIL_ID = ?;";
	private static final String UPDATEORDERDETAIL = "update tblTransactionOrders set ORDER_PLACED=? where ORDER_ID = ?;";
	
	public static List<TransactionOrder> getTransactionOrderbyTransactionDetailId(int transactionDetailId) {
		List<TransactionOrder> transactionOrderList = new ArrayList<>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(GETTRANSACTIONORDERBYTRANSACTIONDETAILID);
			statement.setInt(1, transactionDetailId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				TransactionOrder transactionOrder = new TransactionOrder();
				transactionOrder.setOrderId(resultSet.getInt("ORDER_ID"));
				transactionOrder.setTrasactionDetailId(resultSet.getInt("TRANSACTION_DETAIL_ID"));
				transactionOrder.setUrl(resultSet.getString("URL"));
				transactionOrder.setOrderCount(resultSet.getInt("ORDER_COUNT"));
				
				transactionOrderList.add(transactionOrder);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return transactionOrderList;
	}
	
	public static int update(TransactionOrder transactionOrder) {
		PreparedStatement statement = null;
		int count = 0;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(UPDATEORDERDETAIL);
			statement.setInt(1, transactionOrder.getOrderPlaced());
			statement.setInt(2, transactionOrder.getOrderId());
			System.out.println("Order Placed -->  "+transactionOrder.getOrderPlaced());
			count = statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return count;
	}
}
