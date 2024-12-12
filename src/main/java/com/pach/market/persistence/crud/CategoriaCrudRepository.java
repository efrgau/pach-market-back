package com.pach.market.persistence.crud;

import com.pach.market.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository <Categoria, Integer> {

}
