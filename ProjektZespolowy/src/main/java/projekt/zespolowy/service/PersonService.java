package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.PersonRepository;
import projekt.zespolowy.domain.Person;

import javax.inject.Inject;

/**
 * Created by tomahavvq on 14.11.15.
 */
@Service
@Transactional
public class PersonService {
    
    @Inject
    PersonRepository personRepository;

    public Person getPerson(Long personId) {

        Person person = personRepository.findOne(personId);

        if (person == null) {
            return null;
        }

        return person;
    }
}
