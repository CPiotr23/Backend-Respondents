package com.example.demo.Repos;

import com.example.demo.Entities.Respondents;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RespondentsRepository extends CrudRepository<Respondents, Integer> {
    List<Respondents> findAll();
    Respondents findRespondentById(Integer id);
    List<Respondents> findRespondentsByAge(Integer age);
    List<Respondents> findRespondentsByAgeAndGender(Integer age, String gender);
}
