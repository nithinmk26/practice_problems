/**
 * 
 */
package com.digital.library.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author M1056182
 *
 */
@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
