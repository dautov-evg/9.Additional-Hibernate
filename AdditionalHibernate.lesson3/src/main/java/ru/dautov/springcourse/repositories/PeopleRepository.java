package ru.dautov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dautov.springcourse.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
//    Поиск по имени
    List<Person> findByName(String name);
//    Поиск по имени и сортировка по возрасту
    List<Person> findByNameOrderByAge(String name);
//    Поиск по Email
    List<Person> findByEmail(String email);

//    Поиск людей, чье имя начинается на ...
    List<Person> findByNameStartingWith(String startingWith);

//    Возвращает людей по имени или электронной почте
    List<Person> findByNameOrEmail(String name, String email);
}
