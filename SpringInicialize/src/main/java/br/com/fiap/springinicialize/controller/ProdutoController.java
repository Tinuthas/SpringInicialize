package br.com.fiap.springinicialize.controller;

import br.com.fiap.springinicialize.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutoController {

    @GetMapping("/produto/cadastrar")
    public String abrirFormulario(){
        return "produto/form";
    }

    @PostMapping("/produto/cadastrar")
    public String processarForm(Produto produto,  Model model) {
        System.out.println(produto.getNome() + " " + produto.getPreco());
        model.addAttribute("prod",produto);
        return "produto/sucesso";
    }
}
