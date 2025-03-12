
package participanteevento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Participante {
  


    
    private String nomeCompleto;
    private String email;
    private String dataInscricao;

    
    public Participante(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataInscricao = "12/03/2025"; 

   
    public Participante(String nomeCompleto, String email, String dataInscricao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataInscricao = dataInscricao;
    }

   
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido! O email deve conter '@'.");
        }
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Data da Inscrição: " + dataInscricao);
    }
}

    
    

