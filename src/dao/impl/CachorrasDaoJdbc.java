package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.CachorrasDao;
import db.Db;
import db.DbException;
import entities.Cachorras;
import entities.Lugar;

public class CachorrasDaoJdbc implements CachorrasDao
{
     private Connection conn;
     
     public CachorrasDaoJdbc(Connection conn) {this.conn = conn;}
	
	@Override
	public void inseri(Cachorras cac)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualiza(Cachorras cac)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleta(Integer id)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cachorras find(Integer id)
	{
		PreparedStatement st = null;
		ResultSet rs = null;
		try
		{
			  st = conn.prepareStatement("select cachorras.*, lugar.nome from cachorras inner join lugar"
			  		                                                        + " on cachorras.id_lugar = lugar.id where cachorras.id = ?");
			  st.setInt(1, id);
			  rs = st.executeQuery();
			  if(rs.next())
			  {
				    Lugar lu = new Lugar();
				    lu.setId(rs.getInt("id_lugar"));
				    lu.setNome(rs.getString("nome"));
				    
				    Cachorras cach = new Cachorras();
				    cach.setId(rs.getInt("id"));
				    cach.setNome(rs.getString("nome"));
				    cach.setRaca(rs.getString("raca"));
				    cach.setLugar(lu);
				    return cach;
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
	public List<Cachorras> findall()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
