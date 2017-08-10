package me.soulyana.demo.repository;

import me.soulyana.demo.model.PotObject;
import org.springframework.data.repository.CrudRepository;



public interface PotObjectRepository extends CrudRepository<PotObject, Long> {
    //extends the Crud Repository
}
