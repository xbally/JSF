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


@Named(value="exemploMB5")
@RequestScoped
public class ExemploMB5 {
    private List<String> estados;
    
    @PostConstruct
    public void init(){
        estados = new ArrayList<String>();
        estados.add("pr");
        estados.add("sc");
        
    }

    public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }
    
    
}
