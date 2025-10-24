package dao;

import java.util.List;

import entities.Setor;

public interface SetorDao
{
          void inseri(Setor set);
          void atualiza(Setor set);
          void deleta(Integer id);
          Setor find(Integer id);
          List<Setor> findall();
}
