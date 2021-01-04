package com.grspck.repositories;

import com.grspck.models.Grupa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface GrupaRepository extends JpaRepository<Grupa, Integer>
{
}
