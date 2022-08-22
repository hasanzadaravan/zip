package Controller;

import DTO.PersonDto;
import Service.PersonInter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/v1/persons")

public class PersonController {

    private final PersonInter personInter;

    public PersonController(PersonInter personInter) {
        this.personInter = personInter;
    }


    @GetMapping
    public ResponseEntity<List<PersonDto>> get() {

        return ResponseEntity.ok(personInter.getpersons());
    }


}
