package com.masacr3.donacionesApi.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryCbu extends MongoRepository<Cbu, String> {
}
