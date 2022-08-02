package com.example.demo.api.repository;

import com.example.demo.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> {
}
