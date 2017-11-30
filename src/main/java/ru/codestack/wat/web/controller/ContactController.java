package ru.codestack.wat.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.codestack.wat.domain.Contact;
import ru.codestack.wat.service.ContactService;

import java.util.List;

/**
 * @author Valerii Medvedev
 */
@RequestMapping("/contacts")
@Controller
public class ContactController {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        log.info("Listing contacts.");
        final List<Contact> contacts = contactService.findAll();
        uiModel.addAttribute("contacts", contacts);
        log.info("No. of contacts: " + contacts.size());

        return "contacts/list";
    }
}
