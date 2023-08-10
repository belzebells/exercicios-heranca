package POO;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
    private String nome;
    private LocalDate nascimento;
    private String telefone;
    private String email;

    public Cliente(String nome,
                   LocalDate nascimento,
                   String telefone,
                   String email) {

        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void visualizar() {
        System.out.println("nome: " + this.nome);
        System.out.println("nascimento: " + this.nascimento);
        System.out.println("telefone: " + this.telefone);
        System.out.println("email: " + this.email);
    }

    @Override
    public String toString() {

        return "Cliente{" +
                "\nome: '" + nome + '\'' +
                "\nnascimento: " + nascimento +
                "\ntelefone: '" + telefone + '\'' +
                "\n email: '" + email + '\'' +
                "\n}";
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Cliente cliente = (Cliente) obj;

        return Objects.equals(getNome(), cliente.getNome()) &&
                Objects.equals(getNascimento(), cliente.getNascimento()) &&
                Objects.equals(getTelefone(), cliente.getTelefone()) &&
                Objects.equals(getEmail(), cliente.getEmail());
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int hash = 1;

        hash *= prime + ((getNome() == null) ? 0 : getNome().hashCode());
        hash *= prime + ((getNascimento() == null) ? 0 : getNascimento().hashCode());
        hash *= prime + ((getTelefone() == null) ? 0 : getTelefone().hashCode());
        hash *= prime + ((getEmail() == null) ? 0 : getEmail().hashCode());

        if (hash < 0)
            hash = -hash;

        return hash;
    }

    public Cliente(Cliente cliente) {

        if (cliente == null) {
            throw new NullPointerException("cliente não pode ser nulo, por favor preencha");
        }

        this.nome = cliente.nome;
        this.nascimento = cliente.nascimento;
        this.telefone = cliente.telefone;
        this.email = cliente.email;
    }

    public Object Clone() {
        Cliente cliente = null;

        try {
            cliente = new Cliente(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }
}