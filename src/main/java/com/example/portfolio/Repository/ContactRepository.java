package com.example.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolio.Entity.ContactForm;

@Repository
public interface ContactRepository extends JpaRepository<ContactForm, Long>  {

}
