package br.com.meli.springbootworkshop.service;

import br.com.meli.springbootworkshop.dto.CarroDto;
import br.com.meli.springbootworkshop.model.Carro;
import br.com.meli.springbootworkshop.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public String primeiroMetodoService(){
        return "Olá galerinha!";
    }

    public String save(CarroDto carroDto){

        if(carroDto.getModelo().equals("quadrado")){
            Carro carro = new Carro();
            carro.setId(carroDto.getId());
            carro.setModelo(carroDto.getModelo());

            carroRepository.save(carro);
            return "Carro Salvo!";
        }
        return "Carro de modelo errado!";

    }

}
