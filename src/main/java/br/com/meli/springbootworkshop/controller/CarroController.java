package br.com.meli.springbootworkshop.controller;

import br.com.meli.springbootworkshop.dto.CarroDto;
import br.com.meli.springbootworkshop.model.Carro;
import br.com.meli.springbootworkshop.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/primeiro")
    public String primeiroMetodo(){
        return carroService.primeiroMetodoService();
    }

    @PostMapping
    public String save(@RequestBody CarroDto carroDto){
        String retorno = carroService.save(carroDto);
        return retorno;
    }

}
