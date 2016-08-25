/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oparacaocaixa;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Darci
 */
public class OparacaoCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x = 0;
        FilaCaixa fc = new FilaCaixa();
      
        
        while(x!=-1){
              System.out.println("1 - Adicionar Cliente a Fila de espera");
        System.out.println("2 - Proximo Cliente do Caixa");
        System.out.println("3 - liberar caixa");
        System.out.println("4 - sair");
              x = scan.nextInt();
      
        
            switch(x){
            
            case 1 :
                String nomeCliente = scan.nextLine();
               
                        nomeCliente = scan.next();
                int idade = scan.nextInt();
                
                Cliente cli = new Cliente(idade,nomeCliente);
                fc.addClienteFila(cli);
                System.out.println("Cliente adicionado a fila de espera aguandando ser chamado !");
                break;
            case 2:
                fc.proxClienteCaixa();
                System.out.println("Cliente foi chamado para o caixa ! veja abaixo os clientes em atendimento");
                
              
              
                fc.mostrarClienteEmAtendimento();
                break;
            case 3:
                
                fc.liberarCaixa();
             System.out.println("Caixa liberado");
                
                
              break;
            
            case 4 :
                x =-1;
                break;
            
        }
    
        
    }
        
        
        
        
    }
    
}
