package com.kat.base;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.kat.db.DBConnection;

public class BBOrderPlacement {
	// String master_query = "Select Master_Id from MASTER;";
	// String detail_query;
	DBConnection obj = new DBConnection();
	static Logger logger;
	static int i = 1;
	static ResultSet trans_ord_rs;
	static int temp_detail_id = 0, master_id, order_id, trans_detail_id, detail_id;
	static String URL = null, master_status = null, trans_status = null, session_id = null;
	static int qty = 0;
	
	
	public static void main(String[] args) {

		OrderPlacement op = new OrderPlacement();

		String query = "select M.MASTER_ID, M.MASTER_STATUS, M.SESSION_ID, T.ORDER_ID, D.DETAIL_ID,T.TRANSACTION_DETAIL_ID,"
				+ "T.URL, TD.TRANSACTION_STATUS, TD.TRACKING_STATUS, TD.TRANSACTION_NUMBER, TD.TRACKING_NUMBER, TD.MACHINE_NAME, "
				+ "TD.COMMENTS, T.ORDER_COUNT, T.ORDER_PLACED, T.ORDER_AVAILABLE from tblTransactionOrders T "
				+ "inner join tblTransactionDetails TD ON T.TRANSACTION_DETAIL_ID = TD.TRANSACTION_DETAIL_ID "
				+ "inner join tblDetails D ON TD.DETAIL_ID = D.DETAIL_ID "
				+ "inner join tblMaster M ON D.MASTER_ID = M.MASTER_ID order by TD.TRANSACTION_DETAIL_ID";

		trans_ord_rs = op.obj.ConnectionSQLite(query);

		try {
			/*int temp_detail_id = 0, master_id, order_id, trans_detail_id, detail_id;
			String URL = null, master_status = null, trans_status = null, session_id = null;
			int qty = 0;*/
			while (trans_ord_rs.next()) {

				master_id = trans_ord_rs.getInt("MASTER_ID");
				master_status = trans_ord_rs.getString("MASTER_STATUS");
				session_id = trans_ord_rs.getString("SESSION_ID");
				order_id = trans_ord_rs.getInt("ORDER_ID");
				detail_id = trans_ord_rs.getInt("DETAIL_ID");
				trans_detail_id = trans_ord_rs.getInt("TRANSACTION_DETAIL_ID");
				URL = trans_ord_rs.getString("URL");
				trans_status = trans_ord_rs.getString("TRANSACTION_STATUS");
				qty = trans_ord_rs.getInt("ORDER_COUNT");

				System.out.println(" MasterId " + master_id + "| Master Status " + master_status + "| Session ID "
						+ session_id + "| OrderId " + order_id + "| DetailId " + detail_id + "| TransacationDetail id "
						+ trans_detail_id + "| URL " + URL + "|  QTY " + qty);
				/*
				 * logger.info(" MasterId " + master_id + "| Master Status " +
				 * master_status +"| Session ID "+session_id +"| OrderId " +
				 * order_id + "| DetailId " + detail_id +
				 * "| TransacationDetail id " + trans_detail_id + "| URL " + URL
				 * + "|  QTY " + qty);
				 */
				if (temp_detail_id != 0 && temp_detail_id != trans_detail_id) {
					checkOut();
					try {
						System.out.println("Transaction Detail Id   "+trans_detail_id);
						trans_ord_rs.updateString("TRANSACTION_STATUS", "PRCD");
						trans_ord_rs.updateRow();
						trans_ord_rs.updateString("TRACKING_STATUS", "NW");
						trans_ord_rs.updateString("TRANSACTION_NUMBER", "ORD"+trans_detail_id);
						trans_ord_rs.updateString("TRACKING_NUMBER", "TRCK"+trans_detail_id);
						trans_ord_rs.updateRow();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

				/*
				 * if(master_status.equals("NW") && (temp_detail_id ==0 ||
				 * temp_detail_id == trans_detail_id)){
				 */
				if (master_status.equals("NW")) {
					if (trans_status.equals("NW")) {
						for (int counter = 1; counter <= qty; counter++) {
							System.out.println("Add to Cart for  " + counter + "  " + URL);
							// InitializeBrowser.InvokeBrowser(URL);
						}
					}
					
					
					//Update tblTransactionOrders Table
					System.out.println("Order Quantity "+qty+"  and Order Id  "+order_id);
					trans_ord_rs.updateInt("ORDER_PLACED", qty);
					trans_ord_rs.updateInt("ORDER_AVAILABLE", qty);
					trans_ord_rs.updateRow();
					/*String update_trans_orders="update tblTransactionOrders set ORDER_PLACED="+qty+"where ORDER_ID="+order_id+";";
					op.obj.ConnectionSQLite(update_trans_orders);*/
					
					temp_detail_id = trans_detail_id;
					System.out.println("Temp Detail Id  " + temp_detail_id);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Temporary Method
	public static void checkOut() {
		System.out.println("Check-out Procedure Started " + i);
		i++;
		//Update 
		/*try {
			trans_ord_rs.updateString("TRANSACTION_STATUS", "PRCD");
			trans_ord_rs.updateString("TRACKING_STATUS", "NW");
			trans_ord_rs.updateString("TRANSACTION_NUMBER", "ORD"+trans_detail_id);
			trans_ord_rs.updateString("TRACKING_NUMBER", "TRCK"+trans_detail_id);
			trans_ord_rs.updateRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//String update_trans_details = 
	}
}
