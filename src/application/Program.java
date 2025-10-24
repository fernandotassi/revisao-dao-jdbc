package application;

import java.util.Date;

import dao.CachorrasDao;
import dao.DaoFabrica;
import dao.LugarDao;
import entities.Cachorras;
import entities.Lugar;

public class Program 
{
	public static void main(String[] args) 
	{
	         //Lugar lug = new Lugar(1, "apart");
	        //Cachorras ari = new Cachorras(1, "perola", "generica", lug);
	         
	         //System.out.println(lug);
	         //ystem.out.println(ari);
	         
	         CachorrasDao ara = DaoFabrica.criaCachorraDao();
	         Cachorras ca = ara.find(5);
	         System.out.println(ca);
	         LugarDao sat = DaoFabrica.criaLugar();
	         Lugar lai = sat.find(4);
	         System.out.println(lai);
	}

}
