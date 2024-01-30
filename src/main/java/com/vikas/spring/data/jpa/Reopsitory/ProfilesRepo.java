package com.vikas.spring.data.jpa.Reopsitory;

import com.vikas.spring.data.jpa.Model.Profiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProfilesRepo extends CrudRepository <Profiles ,Integer> {
}
