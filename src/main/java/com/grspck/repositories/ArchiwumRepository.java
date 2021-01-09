package com.grspck.repositories;

import com.grspck.models.Archiwum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ArchiwumRepository extends JpaRepository<Archiwum, Integer>
{
}
