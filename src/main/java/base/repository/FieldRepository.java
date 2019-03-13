package base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import base.beans.FieldDetails;

@Repository
public interface FieldRepository extends JpaRepository<FieldDetails, Long> {

}
