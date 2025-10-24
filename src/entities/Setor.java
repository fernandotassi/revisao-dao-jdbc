package entities;

import java.io.Serializable;
import java.util.Objects;

public class Setor implements Serializable
{
          private static final long serialVersionUID = 1L;
          
          private Integer id;
          private String nome;
          
          public Setor(){}
          public Setor(Integer id, String nome){this.id = id; this.nome = nome;}
          
          public void setId(Integer id){this.id = id;}
          public void setNome(String nome){this.nome = nome;}
          
          public Integer getId(){return id;}
          public String getNome(){return nome;}
		  
          @Override
		  public int hashCode() 
		  {
        	  	return Objects.hash(id);
		  }
		  @Override
		  public boolean equals(Object obj)
		  {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Setor other = (Setor) obj;
				return Objects.equals(id, other.id);
		  }
          
		  @Override
          public String toString()
          {return id + ", " + nome + " finito";}
}
