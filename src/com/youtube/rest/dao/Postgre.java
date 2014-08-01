package com.youtube.rest.dao;

import javax.naming.*;
import javax.sql.*;

public class Postgre {
	
	private static DataSource postgre = null;
	private static Context context = null;
	
	public static DataSource postgreConn() throws Exception {
		
		try {
			
			if (context==null){
				context = new InitialContext();
			}			
			postgre = (DataSource) context.lookup("java:comp/env/jdbc/rest");			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return postgre;
	}

	
	

}
