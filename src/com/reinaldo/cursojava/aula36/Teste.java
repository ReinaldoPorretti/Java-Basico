package com.reinaldo.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 9999-9999");
		
		//relacionamento tem um endereco
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua teste");
		end.setNumero("444");
		end.setCidade("Cidade teste");
		end.setCep("Cep teste");
		end.setEstado("Estado teste");
		
		contato.setEndereco(end);
		
		// relacionamento tem um telefone
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("Celular");
		telefone1.setDdd("11");
		telefone1.setNumero("9999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Fixo");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]= telefone1;
		telefones[1]= telefone2;
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(telefone);

		
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getCidade());
		//System.out.println(contato.getTelefone());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());

		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
