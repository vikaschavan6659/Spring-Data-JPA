package com.vikas.spring.data.jpa.Reopsitory;

import com.vikas.spring.data.jpa.Model.Profiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProfilesRepo extends CrudRepository <Profiles ,Integer> {
    List<Profiles> findByName(String str);

    List<Profiles> findByAddress(String str);
}
