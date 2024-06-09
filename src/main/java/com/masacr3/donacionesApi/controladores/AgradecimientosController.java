package com.masacr3.donacionesApi.controladores;

import com.masacr3.donacionesApi.dto.DonacionDto;
import com.masacr3.donacionesApi.dto.PersonaDto;
import com.masacr3.donacionesApi.dto.RespuestaDto;
import com.masacr3.donacionesApi.dto.RespuestaSimpleDto;
import com.masacr3.donacionesApi.mongo.RepositoryUsuario;
import com.masacr3.donacionesApi.mongo.Usuario;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AgradecimientosController {

    private RepositoryUsuario repositoryUsuario;

    @Autowired
    public AgradecimientosController(RepositoryUsuario repositoryUsuario){
        this.repositoryUsuario = repositoryUsuario;
    }

    @GetMapping("/agradecimientos")
    public ArrayList<PersonaDto> getAgradecimientos(){
        ArrayList<PersonaDto> usuarios = new ArrayList<>();
        for(Usuario item : repositoryUsuario.findAll()){
            PersonaDto usuario = new PersonaDto(item.getNombre(), item.getProvincia());
            usuario.setId(item.getId());
            usuarios.add(usuario);
        }
        return usuarios;
    }

    @GetMapping("/test")
    public ResponseEntity<RespuestaSimpleDto> test(){
        RespuestaSimpleDto rta = new RespuestaSimpleDto("CBU");
        return ResponseEntity.ok(rta);
    }

    @PostMapping(value = "/agradecimientos")
    public ResponseEntity<RespuestaDto> agregarDonacion(@RequestBody @NotNull DonacionDto donacion){
        Usuario usuario = new Usuario(donacion.getNombre(), donacion.getProvincia(), donacion.getMonto());
        Usuario usuarioDB = repositoryUsuario.save(usuario);
        RespuestaDto rta = new RespuestaDto("Se ha creado sastifactoriamente el usuario", usuarioDB);
        return ResponseEntity.ok(rta);
    }

    @DeleteMapping("/agradecimientos")
    public ResponseEntity<RespuestaSimpleDto> eliminarDonacion(@PathVariable String id){
        repositoryUsuario.deleteById(id);
        RespuestaSimpleDto rta = new RespuestaSimpleDto("el usuario ah sido borrado exitosamente");
        return ResponseEntity.ok(rta);
    }

}
