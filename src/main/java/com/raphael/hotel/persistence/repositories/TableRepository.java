package com.raphael.hotel.persistence.repositories;
import com.raphael.hotel.persistence.entities.TableEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface TableRepository extends JpaRepository<TableEntity, String> {

    @Query("SELECT p, c from PersonEntity p, CheckInEntity c WHERE p.person_id = c.person_fk_id")
    List<TableEntity> getTableList();

}