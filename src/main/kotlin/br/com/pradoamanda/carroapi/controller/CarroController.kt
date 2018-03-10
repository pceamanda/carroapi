package br.com.pradoamanda.carroapi.controller

import br.com.pradoamanda.carroapi.entity.Carro
import br.com.pradoamanda.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController{

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun findAll() : List<Carro>{
        return carroService.findAll()
    }

    @PostMapping
    fun save(@RequestBody carro: Carro) {
        carroService.save(carro)
    }

}