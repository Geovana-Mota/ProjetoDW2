package DAOs;

import Entidades.Tecnicos;
import java.util.ArrayList;
import java.util.List;


public class DAOTecnicos extends DAOGenerico<Tecnicos> {

    public DAOTecnicos() {
        super(Tecnicos.class);
    }

    public int autoIdTecnicos() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idTecnicos) FROM Tecnicos e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Tecnicos> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Tecnicos e WHERE e.nomeTecnicos LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Tecnicos> listById(int id) {
        return em.createQuery("SELECT e FROM Tecnicos e WHERE e.idTecnicos = :id").setParameter("id", id).getResultList();
    }

    public List<Tecnicos> listInOrderNome() {
        return em.createQuery("SELECT e FROM Tecnicos e ORDER BY e.nomeTecnicos").getResultList();
    }

    public List<Tecnicos> listInOrderId() {
        return em.createQuery("SELECT e FROM Tecnicos e ORDER BY e.idTecnicos").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Tecnicos> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getTecnicosPK() + "-" + lf.get(i).getNomeTecnicos());
        }
        return ls;
    }
}
