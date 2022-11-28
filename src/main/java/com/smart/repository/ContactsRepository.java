package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer>{

}
