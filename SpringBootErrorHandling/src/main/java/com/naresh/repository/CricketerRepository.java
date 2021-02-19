package com.naresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.model.Cricketer;

@Repository
public interface CricketerRepository extends JpaRepository<Cricketer,Integer> {

}
