package locadora.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import locadora.dao.ExceptionDAO;
import locadora.model.Cliente;

public class ClienteController {

	public boolean cadastrarCliente(String nome, String cpf, String email, String endereco, String dtNascimento) throws ParseException, ExceptionDAO {

		if (nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0
				&& endereco != null && endereco.length() > 0 && validarData(dtNascimento)) {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
			Date data = formato.parse(dtNascimento);
			Cliente cliente = new Cliente(nome,cpf,email,endereco, data);
			cliente.cadastrarCliente(cliente);
			return true;
		}
		return false;
	}
	// Ele não valida se o CPF é verdadeiro,
	// Ele apenas confere se os caracteres estão nos lugares certos.
	public boolean validarCPF(String cpf) {
		for (int i = 0; i < cpf.length(); i++) {
			if (!Character.isDigit(cpf.charAt(i))) {
				if (!(i == 3 || i == 7 || i == 11)) {
					return false;
				}

			}
		}
		return true;

	}
	public boolean validarData(String data) {
		for (int i = 0; i < data.length(); i++) {
			if (!Character.isDigit(data.charAt(i))) {
				if (!(i == 2 || i == 5)) {
					return false;
				}

			}
		}
		return true;

	}

}
