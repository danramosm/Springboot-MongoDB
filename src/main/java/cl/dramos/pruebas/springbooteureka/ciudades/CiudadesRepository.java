package cl.dramos.pruebas.springbooteureka.ciudades;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CiudadesRepository extends MongoRepository<Ciudad, String> {

}
