package com.contacts.contacts.dao;

import com.contacts.contacts.Contacts;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ContactsDaoImpl implements ContactsDao{

    private EntityManager entitymanager;

    @Autowired
    public ContactsDaoImpl(EntityManager entitymanager){
        this.entitymanager = entitymanager;
    }

    @Override
    @Transactional
    public void save(Contacts contact){
        entitymanager.persist(contact);
    }

}
