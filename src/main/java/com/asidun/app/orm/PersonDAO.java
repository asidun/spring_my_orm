package com.asidun.app.orm;

import java.util.List;

import com.asidun.app.orm.entity.Person;

public interface PersonDAO {

	void save(Person p);

	List<Person> list();

}
