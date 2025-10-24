package dao;

import java.util.List;

import entities.Arigo;

public interface ArigoDao 
{
        void inseri(Arigo ari);
        void atualiza(Arigo ari);
        void deleta(Integer id);
        Arigo find(Integer id);
        List<Arigo> findall();
}
