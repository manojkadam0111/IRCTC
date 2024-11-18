package com.IRCTC_ResourceApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.IRCTC_ResourceApp.request.Passanger;

@Repository
public interface PassangerRepository extends CrudRepository<Passanger, Integer>{

}
