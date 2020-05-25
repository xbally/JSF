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

@Named(value = "exemploMB3")
@RequestScoped
public class ExemploMB3 {
        private List<String> escolhidos = new ArrayList<String>();
        
        @PostConstruct
            public void init(){
                escolhidos.add("PR");
                escolhidos.add("SC");
                 escolhidos.add("RS");
            }

    public List<String> getEscolhidos() {
        return escolhidos;
    }

    public void setEscolhidos(List<String> escolhidos) {
        this.escolhidos = escolhidos;
    }
            
            
}
