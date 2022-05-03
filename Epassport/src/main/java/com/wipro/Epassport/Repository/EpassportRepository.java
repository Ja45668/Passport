package com.wipro.Epassport.Repository;

import com.wipro.Epassport.Entity.Epassport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpassportRepository extends CrudRepository<Epassport,Integer> {
    Epassport findByEmail(String email);
    @Query("SELECT password FROM Epassport where email=?1")
    String findByPassword(String email);
}
