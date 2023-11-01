package br.com.meli.springbootworkshop.repository;

import br.com.meli.springbootworkshop.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
