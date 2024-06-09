package com.masacr3.donacionesApi.controladores;

import com.masacr3.donacionesApi.dto.CbuDto;
import com.masacr3.donacionesApi.dto.RespuestaCbu;
import com.masacr3.donacionesApi.dto.RespuestaSimpleDto;
import com.masacr3.donacionesApi.mongo.Cbu;
import com.masacr3.donacionesApi.mongo.RepositoryCbu;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CbuController {
    private RepositoryCbu repositoryCbu;

    @Autowired
    public CbuController(RepositoryCbu repositoryCbu){
        this.repositoryCbu = repositoryCbu;
    }

    @PostMapping("/cbu")
    public ResponseEntity<RespuestaCbu> agregarCBU(@RequestBody @NotNull CbuDto cbudto){
        Cbu cbu = new Cbu(cbudto.getCodigo());
        Cbu cbuAgregado =  repositoryCbu.save(cbu);
        RespuestaCbu rta = new RespuestaCbu("cbu agregado", cbuAgregado);
        return ResponseEntity.ok(rta);
    }

    @GetMapping("/cbu")
    public ArrayList<Cbu> obtenerCBU(){
        return new ArrayList<>(repositoryCbu.findAll());
    }
}
