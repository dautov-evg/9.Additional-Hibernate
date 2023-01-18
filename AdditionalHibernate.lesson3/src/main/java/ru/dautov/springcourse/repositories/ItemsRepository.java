package ru.dautov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dautov.springcourse.models.Item;
import ru.dautov.springcourse.models.Person;

import java.util.List;


@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemName(String itemName);

//    person.getItems()
    List<Item> findByOwner(Person owner);
}
