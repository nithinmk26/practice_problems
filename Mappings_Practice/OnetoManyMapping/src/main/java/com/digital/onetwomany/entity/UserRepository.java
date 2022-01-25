/**
 * 
 */
package com.digital.onetwomany.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author M1056182
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
