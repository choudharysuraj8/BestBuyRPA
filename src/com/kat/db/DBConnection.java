package com.kat.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	ResultSet rs ;
	public ResultSet ConnectionSQLite(String query){
			Connection conn = null;
		   Statement stmt = null;
    
    try {
    	//Connection string for SQLite
      /* Class.forName("org.sqlite.JDBC");
       conn = DriverManager.getConnection("jdbc:sqlite:D:/workspace/BestBuy_RobotOrdering/database/BKO.db");
    	*///System.setProperty("java.net.preferIPv6Addresses", "true");
    	
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=MyDatabaseForTesting;integratedSecurity=true");
        //c = DriverManager.getConnection("jdbc:sqlserver://172.16.1.168;databaseName=PortalDevStagingMVC_04Oct2018;user=CI_QA;password=dV3m-qkM");


    /*	Class.forName("net.sourceforge.jtds.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:jtds:sqlserver://localhost;databasename=BKO;user=BBC_User;password=Test@1234;trustServerCertificate=true;encrypt=false;authentication=SqlPassword");
    	*/
       //stmt = conn.createStatement();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
       rs = stmt.executeQuery(query);

    } catch ( Exception e ) {
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
       System.exit(0);
    }
    finally{
    	
    }
   return rs;
}
}
