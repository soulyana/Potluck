package me.soulyana.demo.controllers;

import me.soulyana.demo.model.PotObject;
import org.springframework.data.repository.CrudRepository;

public interface potObjectRepository extends CrudRepository<PotObject,Long> {
    //extends the Crud Repository
}
