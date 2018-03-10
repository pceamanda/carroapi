package br.com.pradoamanda.carroapi.service

import br.com.pradoamanda.carroapi.entity.Carro
import br.com.pradoamanda.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun findAll(): List<Carro> {
        return carroRepository.findAll()
    }

    fun findCarroByMarca(marca: String) : List<Carro> {
        return carroRepository.findByMarcaContaining(marca)
    }

    fun findCarroByAno(ano: Int) : List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun findCarroByPlaca(placa: String) : Carro {
        return carroRepository.findByPlaca(placa)
    }

    fun save(carro: Carro) {
        carroRepository.save(carro)
    }

}