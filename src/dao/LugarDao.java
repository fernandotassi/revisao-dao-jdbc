package dao;

import java.util.List;

import entities.Lugar;

public interface LugarDao
{
          void inseri(Lugar lug);
          void atualiza(Lugar lug);
          void deleta(Integer id);
          Lugar find(Integer id);
          List<Lugar> findall();
}
