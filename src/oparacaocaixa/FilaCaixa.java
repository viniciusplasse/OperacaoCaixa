/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oparacaocaixa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darci
 */
public class FilaCaixa {
    private List<Cliente>filaClientes = new ArrayList<Cliente>();
    private List<Cliente>filaClientesIdosos = new ArrayList<Cliente>();
    private List<Cliente>Caixas = new ArrayList<Cliente>();
    
    
    public void addClienteFila(Cliente c){
        if(c!=null){
            if(c.getIdade()>=65){
            filaClientesIdosos.add(c);
            }else{
                filaClientes.add(c);
            }
            
        }
    }
    public void removeClienteFila(Cliente c){
        if(c.getIdade()>=65){
        filaClientesIdosos.remove(c);
        }else{
        filaClientes.remove(c);
            }
        
    }
    public void proxClienteCaixa(){
        if(Caixas.size()<=10){
        
            if(Caixas.size()<=5){
         
                if(filaClientesIdosos.size()>0){
             
                    Cliente cliente = filaClientesIdosos.get(0);
             
                    Caixas.add(cliente);
             
                    removeClienteFila(cliente);
         
                }else{
              
                    Cliente cliente = filaClientes.get(0);
               
                    Caixas.add(cliente);
               
                    removeClienteFila(cliente);
         }
         
         
     }
        }else{
            System.out.println("Os caixas estao cheios!");
            
        }
        
    }
    public void mostrarClienteEmAtendimento(){
        int caixa = 1;
        for(Cliente c : Caixas){
            System.out.println("Cliente "+c.getNome()+" com idade de "+c.getIdade() +" sendo atendimento pelo caixa "+ caixa);
        caixa++;
                
        }
        
    }
    public void liberarCaixa(){
        
        
        Caixas.remove(0);
        
    }
    public int getSizeCaixa(){
        return Caixas.size();
    }
    
}
