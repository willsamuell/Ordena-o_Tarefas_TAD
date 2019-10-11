/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaçãotarefas;

/**
 *
 * @author Willian teste pra ver se ta dando commit
 */
public class ArrayTarefa {

    private Tarefa[] a; // referencia ao vetor
    private int numeroElementos;

    public ArrayTarefa(int max) {
        a = new Tarefa[max];
        numeroElementos = 0;

    }

    public Tarefa achar(String acharTarefa) {
        int i;

        for (i = 0; i < numeroElementos; i++) {
            if (a[i].getNome().equalsIgnoreCase(acharTarefa)) {
                System.out.println("Existe uma tarefa chamada " + a[i].getNome() + " com cod " + a[i].getId());
                break;
            }
            else{
                 System.out.println("Não encontrado");
               
        
            }
                

        }
        return null;
       
    }

    public void inserirTarefa(String nome, int id) {
        a[numeroElementos] = new Tarefa(nome, id);
        numeroElementos++;
    }

    public void mostrarTarefas() {
        for (int i = 0; i < numeroElementos; i++) {
            a[i].mostrarTarefas();

        }
    }

    public void bubbleSort() {
        Tarefa aux;

        for (int i = 1; i > a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j].getId() > a[j + 1].getId()) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                }
            }
        }
    }

    public void insertionSort() {
        Tarefa aux;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j].getId() < a[j - 1].getId()) {
                    aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                } else {
                    break;
                }

            }
        }

    }
}
