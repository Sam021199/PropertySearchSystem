package com.sam.employeeapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.employeeapi.entities.Users;


@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

}
