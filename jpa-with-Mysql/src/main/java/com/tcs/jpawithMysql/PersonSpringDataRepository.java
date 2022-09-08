package com.tcs.jpawithMysql;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonSpringDataRepository extends JpaRepository<Employee,Integer>{

}
