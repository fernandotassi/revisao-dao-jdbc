package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				    Lugar lu = instanciaLugar(rs);
				  
				    Cachorras cach = instanciaCachorras(rs, lu);				
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
		  PreparedStatement st = null;
		  ResultSet rs = null;
		  List<Cachorras> lista = new ArrayList<>();
		  Map<Integer, Lugar> map = new HashMap<>();
		  try 
		  {
				  st = conn.prepareStatement("select cachorras.*, lugar.* from cachorras inner join lugar "
				  		                                                           + "on cachorras.id_lugar = lugar.id order by cachorras.nome");
				  rs = st.executeQuery();	
		          while(rs.next())
		          {	  
		        	          Lugar la = map.get(rs.getInt("id_lugar"));
		        	          if(la == null)
		        	          {	  
								       la = instanciaLugar(rs);
				        	           map.put(rs.getInt("id_lugar"), la);
		        	          }
						      Cachorras cac = instanciaCachorras(rs, la);
						      lista.add(cac);
		          }
		  }
		 catch(SQLException e){throw new DbException(e.getMessage());}
		  finally
		  {
			     Db.fechars(rs);
			     Db.fechast(st);
		  }
		  return lista;
	}
	
	@Override
	public List<Cachorras> findlug(Lugar liu) 
	{
		  PreparedStatement st = null;
		  ResultSet rs = null;
		  try
		  {
			     List<Cachorras> lista = new ArrayList<>(); 
			     Map<Integer, Lugar> map = new HashMap<>();
			     st = conn.prepareStatement("select cachorras.*, lugar.* from cachorras inner join lugar on cachorras.id_lugar = lugar.id "
			     		                                                       + "where cachorras.id_lugar = ? order by cachorras.nome");		    	
			     st.setInt(1, liu.getId());			    
			     rs = st.executeQuery(); 
			     while(rs.next())
			     {
			    	    Lugar la = map.get(rs.getInt("id_lugar"));
			    	    if(la == null)
			    	    {	
			    	           la= instanciaLugar(rs);
			    	           map.put(rs.getInt("id_lugar"), la);
			    	    }      
			    	    Cachorras cac = instanciaCachorras(rs, la);
			    	    lista.add(cac);			    	  
			     }	 
			     return lista;
		  }
		  catch(SQLException e){throw new DbException(e.getMessage());}
		  finally
		  {
			      Db.fechars(rs);
			      Db.fechast(st);
		  }		 
	  }
    
	private Lugar instanciaLugar(ResultSet rs)
	{
		 try
		 {
				  Lugar lu = new Lugar(rs.getInt("lugar.id"), rs.getString("lugar.nome"));
				  return lu;
		 }
		 catch(SQLException e){throw new DbException(e.getMessage());}
	}
	
	private Cachorras instanciaCachorras(ResultSet rs, Lugar la)
	{
		   try
		   {
					   Cachorras cac = new Cachorras(rs.getInt("id"), rs.getString("nome"), rs.getString("raca"), la);
					   return cac;
		   }
		   catch(SQLException e){throw new DbException(e.getMessage());}
	}

}
