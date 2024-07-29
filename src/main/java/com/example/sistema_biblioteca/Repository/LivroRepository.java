package com.example.sistema_biblioteca.Repository;

import com.example.sistema_biblioteca.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByTitleContaining(@Param("title") String title);

    List<Livro> findByAuthorContaining(@Param("author") String author);
}
