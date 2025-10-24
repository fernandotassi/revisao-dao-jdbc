package dao;

import dao.impl.CachorrasDaoJdbc;
import dao.impl.LugarDaoJdbc;
import db.Db;

public class DaoFabrica
{
        public static CachorrasDao criaCachorraDao()
        {
        	     return new CachorrasDaoJdbc(Db.conecta());
        }
        public static LugarDao criaLugar()
        {
        	    return new LugarDaoJdbc(Db.conecta());
        }
}
