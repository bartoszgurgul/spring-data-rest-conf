package pl.javastart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.javastart.demo.model.Producer;

@RepositoryRestResource
public interface ProducerRepository extends JpaRepository<Producer, Long> {


}
