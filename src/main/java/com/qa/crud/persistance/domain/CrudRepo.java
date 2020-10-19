package com.qa.crud.persistance.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepo extends JpaRepository<Crud, Long> {

}
