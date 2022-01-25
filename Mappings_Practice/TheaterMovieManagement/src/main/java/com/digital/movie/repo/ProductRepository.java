/**
 * 
 */
package com.digital.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.movie.entity.Product;

/**
 * @author M1056182
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
