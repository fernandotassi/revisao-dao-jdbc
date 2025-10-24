package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.LugarDao;
import db.Db;
import db.DbException;
import entities.Lugar;

public class LugarDaoJdbc implements LugarDao
{
	  Connection conn;
	  public LugarDaoJdbc(Connection conn){this.conn = conn;}
	
	@Override
	public void inseri(Lugar lug) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualiza(Lugar lug) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleta(Integer id) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lugar find(Integer id) 
	{
		    PreparedStatement st = null;
		    ResultSet rs = null;
		    try
		    {
		    	    st = conn.prepareStatement("select  * from lugar where id = ?");
		    	    st.setInt(1, id);
		    	    rs = st.executeQuery();
		    	    if(rs.next())
		    	    {
		    	    	  Lugar lui = new Lugar(rs.getInt("id"), rs.getString("nome"));
		    	    	  return lui;
		    	    }	
		    	    return null;
		    }
		    catch(SQLException e){throw new DbException(e.getMessage());}
	        finally
	        {
	        	   Db.fechars(rs);
	        	   Db.fechast(st);
	        }
	}

	@Override
	public List<Lugar> findall() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
