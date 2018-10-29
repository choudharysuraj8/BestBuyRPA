package com.kat.base;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.kat.db.DBConnection;
import com.kat.util.log.LoggerAppender;

public class OrderPlacement {
	// String master_query = "Select Master_Id from MASTER;";
	// String detail_query;
	DBConnection obj = new DBConnection();
	static Logger logger;

	public static void main(String[] args) {

		OrderPlacement op = new OrderPlacement();

		String query = "select M.MASTER_ID, M.MASTER_STATUS, M.SESSION_ID, T.ORDER_ID, D.DETAIL_ID,T.TRANSACTION_DETAIL_ID,T.URL, TD.TRANSACTION_STATUS, T.ORDER_COUNT from tblTransactionOrders T "
				+ "inner join tblTransactionDetails TD ON T.TRANSACTION_DETAIL_ID = TD.TRANSACTION_DETAIL_ID "
				+ "inner join tblDetails D ON TD.DETAIL_ID = D.DETAIL_ID "
				+ "inner join tblMaster M ON D.MASTER_ID = M.MASTER_ID order by TD.TRANSACTION_DETAIL_ID";

		ResultSet trans_ord_rs = op.obj.ConnectionSQLite(query);

		try {
			int old_trans_detail_id = 0, master_id, order_id, trans_detail_id, detail_id;
			String URL = null, master_status = null, trans_status = null, session_id = null;
			int qty = 0;
			while (trans_ord_rs.next()) {

				trans_detail_id = trans_ord_rs.getInt("TRANSACTION_DETAIL_ID");
				/*
				 * System.out.println("Transaction Detail Id   " + trans_detail_id);
				 * System.out.println("Old Detail Id   " + old_trans_detail_id);
				 */
				/*
				 * if (old_trans_detail_id != trans_detail_id && old_trans_detail_id != 0) {
				 * 
				 * } else {
				 */
				if (master_status.equals("NW")) {
					System.out.println("Inside Else Loop");
					// old_trans_detail_id = trans_detail_id;
					master_status = trans_ord_rs.getString("MASTER_STATUS");
					master_id = trans_ord_rs.getInt("MASTER_ID");
					session_id = trans_ord_rs.getString("SESSION_ID");
					order_id = trans_ord_rs.getInt("ORDER_ID");
					detail_id = trans_ord_rs.getInt("DETAIL_ID");
					// trans_detail_id =
					// trans_ord_rs.getInt("TRANSACTION_DETAIL_ID");
					URL = trans_ord_rs.getString("URL");
					trans_status = trans_ord_rs.getString("TRANSACTION_STATUS");
					qty = trans_ord_rs.getInt("ORDER_COUNT");
					logger = LoggerAppender.loggerCreation(master_id, order_id, detail_id, URL);
					System.out.println("Master Status " + master_status + " MasterId " + master_id + " OrderId "
							+ order_id + " DetailId " + detail_id + " TransacationDetail id " + trans_detail_id
							+ " URL " + URL + "  QTY " + qty);
					logger.info("Master Status " + master_status + " MasterId " + master_id + " OrderId " + order_id
							+ " DetailId " + detail_id + " TransacationDetail id " + trans_detail_id + " URL " + URL
							+ "  QTY " + qty);

					System.out.println("session_id    " + session_id);
					if (master_status.equals("NW")) {
						System.out.println("Master Stattus is NEW \n");
						logger.info("Master Stattus in NEW");
						if (trans_status.equals("NW")) {
							System.out.println("Transaction Stattus is NEW");
							logger.info("Transaction Stattus is NEW");

							int counter = 1;
							for (counter = 1; counter <= qty; counter++) {
								// URL should hit per quantity
								System.out.println("URL " + URL + " Counter " + counter);

							}

							// Checkout code should called here
							String update_trans_details_query = "update tblTransactionDetails set TRANSACTION_NUMBER='PRCD' where  TRANSACTION_STATUS='NW' and TRANSACTION_DETAIL_ID="
									+ trans_detail_id;
							op.obj.ConnectionSQLite(update_trans_details_query);
						}

					}

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void getMasterData() { ResultSet master_rs =
	 * obj.ConnectionSQLite(master_query); try { while (master_rs.next()) { int id =
	 * master_rs.getInt("Master_Id"); detail_query =
	 * "Select Details_Id from DETAILS where Master_Id="+id+";";
	 * System.out.println("Master ID = " + id); this.getDetailsData(detail_query); }
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 * 
	 * 
	 * 
	 * public void getDetailsData(String query) { ResultSet details_rs =
	 * obj.ConnectionSQLite(query); try { while (details_rs.next()) { int id =
	 * details_rs.getInt("Details_Id"); transaction_query System.out.println(
	 * "Details ID = " + id); } } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
