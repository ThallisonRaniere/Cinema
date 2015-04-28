package br.com.itworkssolutions.cinema.controllers;

import br.com.itworkssolutions.cinema.dao.DiretorBanco;
import br.com.itworkssolutions.cinema.models.Diretor;
import java.util.ArrayList;
import java.util.List;

/**
 **@author ITWorksSolutions
 */
public class DiretorController {

    public void SaveDiretor(Diretor diretor) {
        DiretorBanco d = new DiretorBanco();
        d.save(diretor);
    }

    public void UpdateDiretor(Diretor diretor) {
        DiretorBanco d = new DiretorBanco();
        d.update(diretor);
    }

    public List<Diretor> SelecionarDiretorByNome(Diretor diretor) throws Exception {
        DiretorBanco d = new DiretorBanco();
        List<Diretor> data = new ArrayList<>();
        data.clear();
        if (data.isEmpty()) {
            data = d.getByName(diretor);
            return data;
        } else {
            return null;
        }
    }

    public List<Diretor> SelecionarDiretorByID(Diretor diretor) throws Exception {
        DiretorBanco d = new DiretorBanco();
        List<Diretor> data = new ArrayList<>();
        data.clear();
        if (data.isEmpty()) {
            data = d.getById(diretor);
            return data;
        } else {
            return null;
        }
    }

    public List<Diretor> SelecionarTodosDiretores() throws Exception {
        DiretorBanco d = new DiretorBanco();
        List<Diretor> data = new ArrayList<>();
        data.clear();
        if (data.size() <= 0) {
            data = d.list();
            return data;
        } else {
            return null;
        }
    }

//    public static void main(String[] args) throws Exception {
//        DiretorController d = new DiretorController();
//        List<Diretor> dataResult = new ArrayList<>();
//        dataResult.clear();
//        dataResult = d.SelecionarTodosDiretores();
//        if (dataResult.size() > 0) {
//            for (Diretor diretor : dataResult) {
//                System.out.println(diretor.getIddiretor());
//                System.out.print(" " + diretor.getNomeDiretor());
//                System.out.println("\n");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Não existe diretores cadastrados!");
//        }
//    }
}
