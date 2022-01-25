/**
 * 
 */
package com.digital.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.company.entity.Employee;

/**
 * @author M1056182
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
