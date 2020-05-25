/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gabri
 */

@Named(value = "exemploMB6")
@RequestScoped
public class ExemploMB6 {

    private String selecionado;
    private List<Estado> listaEstados;

    @PostConstruct
    public void init() {
        listaEstados = new ArrayList<Estado>();
        Estado e = new Estado();
        e.setSigla("PR");
        e.setNome("Paraná");
        listaEstados.add(e);
        e = new Estado();
        e.setSigla("SC");
        e.setNome("Santa Catarina");
        listaEstados.add(e);
    }

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }
    
    

}
