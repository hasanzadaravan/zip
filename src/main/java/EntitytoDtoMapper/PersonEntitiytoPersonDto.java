package EntitytoDtoMapper;

import DTO.PersonDto;
import Entitys.PersonEntity;

public class PersonEntitiytoPersonDto {

    public PersonDto entitytodtoMapper(PersonEntity personEntity) {
        return PersonDto.builder()
                .name(personEntity.getName())
                .surname(personEntity.getSurname())
                .build();
    }
}
