package ru.codestack.wat.service.impl;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.codestack.wat.domain.Contact;
import ru.codestack.wat.repository.ContactRepository;
import ru.codestack.wat.service.ContactService;

import java.util.List;

/**
 *
 * @author Valerii Medvedev
 */
@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Transactional(readOnly = true)
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }
}
