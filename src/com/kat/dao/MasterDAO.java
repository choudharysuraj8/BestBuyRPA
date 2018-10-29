package com.kat.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;
import com.kat.bean.Master;
import com.kat.db.Database;

public class MasterDAO {

	private static final String ALLMASTERS = "select MASTER_ID, MASTER_STATUS, SESSION_ID, RECORD_COUNT, SEQUENCE from tblMaster where MASTER_STATUS='NW';"; 
	
	public static List<Master> getAllMasters(){
		List<Master> masterList = new ArrayList<>();
		Statement statement = null;
		ResultSet resultSet = null;
		Connection connection = Database.getConnection();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(ALLMASTERS);
			while (resultSet.next()) {
				Master master = new Master();
				master.setId(resultSet.getInt("MASTER_ID"));
				master.setStatus(resultSet.getString("MASTER_STATUS"));
				master.setSession_id(resultSet.getString("SESSION_ID"));
				master.setSequence(resultSet.getInt("SEQUENCE"));
				master.setRecord_count(resultSet.getInt("RECORD_COUNT"));
				masterList.add(master);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Database.closeConnection(connection);
		}
		
		return masterList;
	}
}
