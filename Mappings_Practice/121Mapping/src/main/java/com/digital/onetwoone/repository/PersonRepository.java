/**
 * 
 */
package com.digital.onetwoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.onetwoone.entity.Person;

/**
 * @author M1056182
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
