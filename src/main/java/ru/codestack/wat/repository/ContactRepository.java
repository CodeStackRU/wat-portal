package ru.codestack.wat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.codestack.wat.domain.Contact;

/**
 *
 * @author Valerii Medvedev
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
