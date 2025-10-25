package dao;

import java.util.List;

import entities.Cachorras;
import entities.Lugar;

public interface CachorrasDao 
{
        void inseri(Cachorras ari);
        void atualiza(Cachorras ari);
        void deleta(Integer id);
        Cachorras find(Integer id);
        List<Cachorras> findall();
        List<Cachorras> findlug(Lugar lu);
}
