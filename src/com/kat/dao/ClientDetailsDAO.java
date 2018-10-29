package com.kat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kat.bean.ClientDetail;
import com.kat.db.Database;

public class ClientDetailsDAO {

	private static final String GETCLIENTSBYMASTERID = "select DETAIL_ID, Email, First_Name, Last_Name, Phone, Shipping_Address, "
			+ "Shipping_Address_2, Shipping_City, Shipping_State, Shipping_Zip, Billing_Address, Billing_Address_2, Billing_City, "
			+ "Billing_State, Billing_Zip, Card_Number, Expiration_Month, Expire_Year, Security_Code, Number_Of_Orders_Per_Account, "
			+ "Username, Password, Guest_Checkout, Shipping_Speed, IP_Change from tblDetails where MASTER_ID = ?;";

	public static List<ClientDetail> getClientDetailsbyMasterId(int masterId) {
		List<ClientDetail> clientDetailList = new ArrayList<>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Connection connection = Database.getConnection();
		try {
			statement = connection.prepareStatement(GETCLIENTSBYMASTERID);
			statement.setInt(1, masterId);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ClientDetail clientDetail = new ClientDetail();
				clientDetail.setDetailId(resultSet.getInt("DETAIL_ID"));
				clientDetail.setEmail(resultSet.getString("Email"));
				clientDetail.setFirstName(resultSet.getString("First_Name"));
				clientDetail.setLastName(resultSet.getString("Last_Name"));
				clientDetail.setPhone(resultSet.getString("Phone"));
				clientDetail.setShippingAddress_1(resultSet.getString("Shipping_Address"));
				clientDetail.setShippingAddress_2(resultSet.getString("Shipping_Address_2"));
				clientDetail.setShippingCity(resultSet.getString("Shipping_City"));
				clientDetail.setShippingState(resultSet.getString("Shipping_State"));
				clientDetail.setShippingZip(resultSet.getString("Shipping_Zip"));
				clientDetail.setBillingAddress_1(resultSet.getString("Billing_Address"));
				clientDetail.setBillingAddress_2(resultSet.getString("Billing_Address_2"));
				clientDetail.setBillingCity(resultSet.getString("Billing_City"));
				clientDetail.setBillingState(resultSet.getString("Billing_State"));
				clientDetail.setBillingZip(resultSet.getString("Billing_Zip"));
				clientDetail.setCardNumber(resultSet.getString("Card_Number"));
				clientDetail.setExpirationMonth(resultSet.getString("Expiration_Month"));
				clientDetail.setExpireYear(resultSet.getString("Expire_Year"));
				clientDetail.setSecurityCode(resultSet.getString("Security_Code"));
				clientDetail.setNumberOfOrderPerAccount(resultSet.getInt("Number_Of_Orders_Per_Account"));
				clientDetail.setUsername(resultSet.getString("Username"));
				clientDetail.setPassword(resultSet.getString("Password"));
				clientDetail.setGuestCheckout(resultSet.getString("Guest_Checkout"));
				clientDetail.setShippingSpeed(resultSet.getString("Shipping_Speed"));
				clientDetail.setIpChange(resultSet.getString("IP_Change"));
				clientDetailList.add(clientDetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.closeConnection(connection);
		}

		return clientDetailList;
	}
}
