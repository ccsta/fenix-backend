package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Adicione esta anotação para liberar o React
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class HelloController {

    // Injeção do gerente da base de dados
    @Autowired
    private PerfumeRepository repository;

    @GetMapping("/teste")
    public String dizerOla() {
        return "A API do cz está online e a rotear perfeitamente!";
    }

    // O "R" do CRUD: Ler o banco completo (GET)
    @GetMapping("/catalogo")
    public List<Perfume> listarPerfumes() {
        return repository.findAll(); 
    }

    // O "C" do CRUD: Criar um novo perfume (POST)
    @PostMapping("/catalogo")
    public String adicionarPerfume(@RequestBody Perfume novoPerfume) {
        repository.save(novoPerfume);
        return "Perfume '" + novoPerfume.getNome() + "' cadastrado no Banco H2 com sucesso!";
    }

    // O "D" do CRUD: Apagar um perfume pelo ID (DELETE)
    @DeleteMapping("/catalogo/{id}")
    public String apagarPerfume(@PathVariable Long id) {
        // O gerente verifica se o ID realmente existe no banco antes de apagar
        if (repository.existsById(id)) {
            repository.deleteById(id); // Apaga o perfume do banco de dados
            return "Perfume com o ID " + id + " foi removido com sucesso!";
        }
        return "Aviso: O perfume com o ID " + id + " não foi encontrado na base de dados!";
    }
// O "U" do CRUD: Atualizar um perfume pelo ID (PUT)
    @PutMapping("/catalogo/{id}")
    public String atualizarPerfume(@PathVariable Long id, @RequestBody Perfume perfumeAtualizado) {
        
        // Verifica se o perfume realmente existe no banco
        if (repository.existsById(id)) {
            
            // Puxa o perfume antigo da prateleira do banco
            Perfume perfumeAntigo = repository.findById(id).get();
            
            // Atualiza os dados com as informações novas
            perfumeAntigo.setNome(perfumeAtualizado.getNome());
            perfumeAntigo.setMarca(perfumeAtualizado.getMarca());
            perfumeAntigo.setFamiliaOlfativa(perfumeAtualizado.getFamiliaOlfativa());
            
            // Salva de volta na prateleira (como o ID já existe, ele só substitui)
            repository.save(perfumeAntigo);
            
            return "Perfume com ID " + id + " foi atualizado com sucesso!";
        }
        
        return "Erro: Perfume com ID " + id + " não existe!";
    }
}
