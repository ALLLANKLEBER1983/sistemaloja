package com.pluralstudio.sistemaloja.repositories;


import java.util.List;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pluralstudio.sistemaloja.domain.Categoria;
import com.pluralstudio.sistemaloja.domain.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
	
	@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj From Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	Page<Produto> seach(@Param("nome") String nome,@Param("categorias")List<Categoria> categorias,Pageable pageRequest);

}
