/**
 * 
 */
package com.digital.onetwomany.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.onetwomany.entity.UserContact;

/**
 * @author M1056182
 *
 */
@Repository
public interface UserContactRepository extends JpaRepository<UserContact, Integer>{

}
