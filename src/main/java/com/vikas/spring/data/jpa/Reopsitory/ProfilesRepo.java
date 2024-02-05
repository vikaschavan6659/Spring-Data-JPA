package com.vikas.spring.data.jpa.Reopsitory;

import com.vikas.spring.data.jpa.Model.Profiles;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.beans.Transient;
import java.util.List;

@EnableJpaRepositories
public interface ProfilesRepo extends JpaRepository<Profiles ,Integer> {
    List<Profiles> findByName(String str);

    List<Profiles> findByAddress(String str);

    List<Profiles> findByNameAndAddress(String name, String address);

    List<Profiles> findByNameLikeAndAddress(String name, String address);

    @Query(nativeQuery = true ,value = "select * from profile where salary>=:value")
    List<Profiles> findBySalaryGreatherThanEqual(double value);

    @Query("from Profiles")
    List<Profiles> findAll ();

    @Query("from Profiles where address = :str")
    List<Profiles> findByAddres (String str);

    Profiles deleteById(int id );

    @Query("INSERT INTO Profiles (userId, name, contactNo , email ,address , salary) VALUES (:userId, :name, :contactNo , :email ,:address , :salary)")
    void insertProfileData(int userId, String name, String contactNo, String email, String address, Double salary);
}
