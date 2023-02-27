package org.antwalk.repo;

import org.antwalk.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerrepo extends JpaRepository<Customer, Long>{

}
