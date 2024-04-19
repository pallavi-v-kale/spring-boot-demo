package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.madel.AlianM;

@Repository
public interface AlianR extends JpaRepository<AlianM, Integer>
{

}
