package application;

import dao.CachorrasDao;
import dao.DaoFabrica;
import dao.LugarDao;
import entities.Cachorras;
import entities.Lugar;

public class Program 
{
	public static void main(String[] args) 
	{
//	         Lugar lug = new Lugar(1, "apart");
//	        Cachorras ari = new Cachorras(1, "perola", "generica", lug);
//	         
//	         System.out.println(lug);
//	         System.out.println(ari);
	         
	        CachorrasDao ara = DaoFabrica.criaCachorraDao();
//	        Cachorras ca = ara.find(3);
//	        System.out.println(ca + "---");
//	         LugarDao sat = DaoFabrica.criaLugar();
//	         Lugar lai = sat.find(2);
//	         System.out.println(lai);
//	         Lugar lala = new Lugar(3, null);
//	         List<Cachorras> lista  = ara.findlug(lala);
//	         for(Cachorras c: lista)
//	                System.out.println(c);
	         	       
//	         List<Cachorras> liste  = ara.findall();
//	         for(Cachorras c: liste)
//	                System.out.println(c);
		     
 //   	    Lugar la = new Lugar();
//		    la.setNome("apart"); 
//		    sat.inseri(la);
//		    System.out.println("inserido - " + la.getId());
	         
    	    Lugar lua = new Lugar(12, "duda");
//    	    sat.atualiza(lua);
//    	    System.out.println("atualizado - " + lua.getId() + " - " + lua.getNome());
    	        	    		
//          Cachorras cac = new Cachorras();
//	         cac.setNome("rola");
//    	     cac.setRaca("generica");
//          cac.setLugar(lua);
//          ara.inseri(cac);
//	         System.out.println("inserido - " + cac.getId());
    	    
    	    Cachorras cac = new Cachorras();
    	    cac.setId(11);
    	    cac.setRaca("genérica");
    	    ara.atualiza(cac);
    	    System.out.println("atualizado - " + cac.getRaca() + " - " + cac.getId());
    	    
//     	    ara.deleta(13);
    	
    	    
    	    
    	    
    	    
	}
	
	

}
