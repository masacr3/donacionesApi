package com.masacr3.donacionesApi.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryUsuario extends MongoRepository<Usuario, String> {
}
