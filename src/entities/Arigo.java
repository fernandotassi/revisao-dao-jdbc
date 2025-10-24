package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Arigo implements Serializable
{
        private static final long serialVersionUID = 1L;
        
        private Integer id;
        private String nome;
        private String email;
        private Date niver;
        private Double salario;
        
        Setor set = new Setor();
        
        public Arigo(){}
        public Arigo(Integer id, String nome, String email, Date niver, Double salario, Setor set)
        {this.id = id; this.nome = nome; this.email = email; this.niver = niver; this.salario = salario; this.set = set;}
        
        public void setId(Integer id){this.id = id;}
        public void setNome(String nome){this.nome = nome;}
        public void setEmail(String email){this.email = email;}
        public void setNiver(Date niver){this.niver = niver;}
        public void setSalario(Double salario){this.salario = salario;}
        public void setSetor(Setor set){this.set = set;}
        
        public Integer getId(){return id;}
        public String getNome(){return nome;}
        public String getEmail(){return email;}
        public Date getNiver(){return niver;}
        public Double getSalario(){return salario;}
		public Setor getSetor(){return set;}
        
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
			Arigo other = (Arigo) obj;
			return Objects.equals(id, other.id);
		}
        
		@Override
        public String toString()
        {return id + ", " + nome + ", " + email + ", " + niver + ", " + salario + ", " + set + " finito";}
}
