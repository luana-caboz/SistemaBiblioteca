package com.example.sistema_biblioteca.Controller;

import com.example.sistema_biblioteca.Model.Livro;
import com.example.sistema_biblioteca.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public Livro addLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @GetMapping
    public List<Livro> getAllLivros(){
        return livroRepository.findAll();
    }

    @GetMapping("/searchByTitle")
    public List<Livro> searchLivrosPorTitle(@RequestParam String title){
        return livroRepository.findByTitleContaining(title);
    }

    @GetMapping("/searchByAuthor")
    public List<Livro> searchLivrosPorAuthor(@RequestParam String author){
        return livroRepository.findByAuthorContaining(author);
    }
}
