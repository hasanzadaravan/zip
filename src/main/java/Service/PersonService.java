package Service;

import DTO.PersonDto;
import Entitys.PersonEntity;
import EntitytoDtoMapper.PersonEntitiytoPersonDto;
import Repository.PersonRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Getter
@Setter
public class PersonService implements PersonInter {

    private final PersonRepository personRepository;
    private final PersonEntitiytoPersonDto personEntitiytoPersonDto;

    public PersonService(PersonRepository personRepository, PersonEntitiytoPersonDto personEntitiytoPersonDto) {
        this.personRepository = personRepository;
        this.personEntitiytoPersonDto = personEntitiytoPersonDto;
    }


    @Override
    public List<PersonDto> getpersons() {

        List<PersonEntity> personEntities = personRepository.findAll();


        return personEntities.stream().map(personEntitiytoPersonDto::entitytodtoMapper).toList();
    }
}
