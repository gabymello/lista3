
package emprestimodelivro;


public class EmprestimodeLivro {

   
    public static void main(String[] args) {
       Livro livro = new Livro("50 tons de cinza", "Meu pai nao mora mais aqui");
        System.out.println("Livro: " + livro.getTitulo() + ", Disponível: " + livro.isDisponivel());
        livro.emprestar();
        System.out.println("Após empréstimo: " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Após devolução: " + livro.isDisponivel());
    }
}

    
    

