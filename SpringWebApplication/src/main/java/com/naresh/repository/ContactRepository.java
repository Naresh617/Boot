package com.naresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,String> {
}
