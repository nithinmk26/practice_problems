/**
 * 
 */
package com.digital.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.movie.entity.BookData;

/**
 * @author M1056182
 *
 */
@Repository
public interface TheaterRepository extends JpaRepository<BookData, Integer>{

}
