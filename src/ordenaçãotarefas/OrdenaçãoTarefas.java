/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaçãotarefas;

/**
 *
 * @author Willian
 */
public class OrdenaçãoTarefas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayTarefa array; // referencia ao vetor
        array = new ArrayTarefa(6); // cria o vetor
        
        array.inserirTarefa("Willian", 1);
        array.inserirTarefa("Pedro", 3);
        array.inserirTarefa("Ricardo", 2);
        array.inserirTarefa("Cadeira", 6);
        array.inserirTarefa("Cadeira", 92);
        array.inserirTarefa("MEsa", 66);
       array.achar("Pedro");
        
        
        
        
    }
    
}
