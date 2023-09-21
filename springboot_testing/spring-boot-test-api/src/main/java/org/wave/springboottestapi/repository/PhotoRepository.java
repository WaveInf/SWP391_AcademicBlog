package org.wave.springboottestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.wave.springboottestapi.model.Photo;

public interface PhotoRepository extends CrudRepository<Photo, Integer>{
    
}
