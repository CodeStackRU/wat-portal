package ru.codestack.wat.service;

import ru.codestack.wat.domain.Contact;

import java.util.List;

/**
 *
 * @author Valerii Medvedev
 */
public interface ContactService {

    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);
}
