package com.pluralstudio.sistemaloja;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pluralstudio.sistemaloja.domain.Categoria;
import com.pluralstudio.sistemaloja.domain.Cidade;
import com.pluralstudio.sistemaloja.domain.Cliente;
import com.pluralstudio.sistemaloja.domain.Endereco;
import com.pluralstudio.sistemaloja.domain.Estado;
import com.pluralstudio.sistemaloja.domain.ItemPedido;
import com.pluralstudio.sistemaloja.domain.Pagamento;
import com.pluralstudio.sistemaloja.domain.PagamentoComBoleto;
import com.pluralstudio.sistemaloja.domain.PagamentoComCartao;
import com.pluralstudio.sistemaloja.domain.Pedido;
import com.pluralstudio.sistemaloja.domain.Produto;
import com.pluralstudio.sistemaloja.domain.enums.EstadoPagamento;
import com.pluralstudio.sistemaloja.domain.enums.TipoCliente;
import com.pluralstudio.sistemaloja.repositories.CategoriaRepository;
import com.pluralstudio.sistemaloja.repositories.CidadeRepository;
import com.pluralstudio.sistemaloja.repositories.ClienteRepository;
import com.pluralstudio.sistemaloja.repositories.EnderecoRepository;
import com.pluralstudio.sistemaloja.repositories.EstadoRepository;
import com.pluralstudio.sistemaloja.repositories.ItemPedidoRepository;
import com.pluralstudio.sistemaloja.repositories.PagamentoRepository;
import com.pluralstudio.sistemaloja.repositories.PedidoRepository;
import com.pluralstudio.sistemaloja.repositories.ProdutoRepository;

@SpringBootApplication
public class SistemaLojaApplication implements CommandLineRunner{
	

	
	public static void main(String[] args) {
		SpringApplication.run(SistemaLojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	

}
