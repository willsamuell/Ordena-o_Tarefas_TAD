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
public class Tarefa {

    private String nome;
    private int id;

    public Tarefa(String nome, int id) {

        this.nome = nome;
        this.id = id;
    }

    public void mostrarTarefas() {
        
        System.out.println("Id Tarefa: " + id);
        System.out.println("Nome: " + nome);
        System.out.println(" ");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
