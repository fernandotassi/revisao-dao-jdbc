package application;

import java.util.Date;

import entities.Arigo;
import entities.Setor;

public class Program 
{
	public static void main(String[] args) 
	{
	         Setor set = new Setor(1, "pre-moldados");
	         Arigo ari = new Arigo(1, "tioxico", "tioxico@gmail.com", new Date(),  3000.);
	         
	         System.out.println(set);
	         System.out.println(ari);
	}

}
