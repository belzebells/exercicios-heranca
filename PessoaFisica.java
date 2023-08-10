package POO;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome,
            LocalDate nascimento,
            String telefone,
            String email, String cpf) {
		super(nome, nascimento, telefone, email);
		this.cpf = cpf;

	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("cpf: " + cpf);
	}
	public void validarcpf() {
		if (getcpf().length() != 11) {
			System.out.println("\ncpf inválido!");

		} else {
			System.out.println("\ncpf válido!");
		}
	}
}