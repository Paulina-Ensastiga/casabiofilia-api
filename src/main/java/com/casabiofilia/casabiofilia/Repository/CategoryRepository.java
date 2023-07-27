package com.casabiofilia.casabiofilia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casabiofilia.casabiofilia.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
