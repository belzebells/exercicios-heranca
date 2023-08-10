package POO;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
	private String cnpj;

	public PessoaJuridica(String nome,
            
            LocalDate nascimento,
            String telefone,
            String email, String cnpj){
          super(nome, nascimento, telefone, email);
          this.cnpj=cnpj;  	
            }

	public String getCnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + cnpj);
	}

	public void validacnpj() {
		if (getCnpj().length() != 14) {
			System.out.println("\ncnpj inválido!");

		} else {
			System.out.println("\ncnpj válido!");
		}
	}
}