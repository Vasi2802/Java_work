package org.antwalk.repo;

import org.antwalk.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reservationrepo extends JpaRepository<Reservation, Long>{

}
