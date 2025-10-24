package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import entities.Lugar;

public class Cachorras implements Serializable
{
        private static final long serialVersionUID = 1L;
        
        private Integer id;
        private String nome;
        private String raca;
           
        Lugar lug = new Lugar();
        
        public Cachorras(){}
        public Cachorras(Integer id, String nome, String raca,  Lugar lug)
        {this.id = id; this.nome = nome; this.raca = raca; this.lug = lug;}
        
        public void setId(Integer id){this.id = id;}
        public void setNome(String nome){this.nome = nome;}
        public void setRaca(String raca){this.raca = raca;}
        public void setLugar(Lugar lug){this.lug = lug;}
        
        public Integer getId(){return id;}
        public String getNome(){return nome;}
        public String getRaca(){return raca;}
		public Lugar getLugar(){return lug;}
        
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
			Cachorras other = (Cachorras) obj;
			return Objects.equals(id, other.id);
		}
        
		@Override
        public String toString()
        {return id + ", " + nome + ", " + raca + ", "  + lug + " /finito";}
}
