package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Db
{
         public static Connection conn = null;
         
         public static Connection conecta()
         {
        	    if(conn == null)
        	    {	
        	    	     try
        	    	     {
			        	    Properties props = propie();
			        	    String url = props.getProperty("dburl");
			        	    String user = props.getProperty("user");
			        	    String pass = props.getProperty("password");
			        	    conn = DriverManager.getConnection(url, user, pass);        	 
        	    	     }
        	    	     catch(SQLException e) {throw new DbException(e.getMessage());}      	    	    
        	    }
        	    return conn;
         }
         
         public static void desconecta()
         {
        	   if(conn != null)
               {   
			        	    try
			        	    {		        	   
					        	           conn.close();
			        	    }
			        	    catch(Exception e) {throw new DbException(e.getMessage());}
        	   }
         }
         
         public static Properties propie()
         {
        	   try(FileInputStream fs = new FileInputStream("propriedades.properties"))
        	   {
		        	   Properties props = new Properties();
		        	   props.load(fs);
		        	   return props;
        	   }
        	   catch(IOException e) {throw new DbException(e.getMessage());}
         }
         public static void fechast(Statement st)
         {
        	     if(st != null)
					try
        	        {
						st.close();
					} 
        	       catch (SQLException e) {throw new DbException(e.getMessage());}
         }
         public static void fechars(ResultSet rs)
         {
        	     if(rs != null)
					try
        	        {
						rs.close();
					} 
        	       catch (SQLException e) {throw new DbException(e.getMessage());}
         }
}



