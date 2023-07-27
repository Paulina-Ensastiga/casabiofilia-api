package com.casabiofilia.casabiofilia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casabiofilia.casabiofilia.Entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
