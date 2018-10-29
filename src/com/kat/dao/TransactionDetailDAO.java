package com.kat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kat.bean.TransactionDetail;
import com.kat.db.Database;

public class TransactionDetailDAO {

	private static final String GETTRANSACTIONDETAILBYDETAILID = "select TRANSACTION_DETAIL_ID, TRANSACTION_STATUS from tblTransactionDetails where DETAIL_ID = ?;";
	private static final String UPDATETRANSACTIONDETAILSTATUS = "update tblTransactionDetails set TRANSACTION_STATUS=? where TRANSACTION_DETAIL_ID = ?;";
	private static final String UPDATETRANSACTIONDETAIL = "update tblTransactionDetails set TRANSACTION_STATUS=?, TRACKING_STATUS=?, TRANSACTION_NUMBER=?, TRACKING_NUMBER=? where TRANSACTION_DETAIL_ID = ?;";

	public static List<TransactionDetail> getTransactionDetailbyDetailId(int detailId) {
		List<TransactionDetail> transactionDetailList = new ArrayList<>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(GETTRANSACTIONDETAILBYDETAILID);
			statement.setInt(1, detailId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				TransactionDetail transactionDetail = new TransactionDetail();
				transactionDetail.setTransactionDetailId(resultSet.getInt("TRANSACTION_DETAIL_ID"));
				transactionDetail.setTransactionStatus(resultSet.getString("TRANSACTION_STATUS"));
				transactionDetailList.add(transactionDetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return transactionDetailList;
	}
	
	public static int update(TransactionDetail transactionDetail) {
		PreparedStatement statement = null;
		int count = 0;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(UPDATETRANSACTIONDETAIL);
			statement.setString(1, transactionDetail.getTransactionStatus());
			statement.setString(2, transactionDetail.getTrackingStatus());
			statement.setString(3, transactionDetail.getTransactionNumber());
			statement.setString(4, transactionDetail.getTrackingNumber());
			statement.setInt(5, transactionDetail.getTransactionDetailId());
			count = statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return count;
	}
	
	public static int updateStatus(TransactionDetail transactionDetail) {
		PreparedStatement statement = null;
		int count = 0;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(UPDATETRANSACTIONDETAILSTATUS);
			statement.setString(1, transactionDetail.getTransactionStatus());
			statement.setInt(2, transactionDetail.getTransactionDetailId());
			count = statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return count;
	}
	
}
