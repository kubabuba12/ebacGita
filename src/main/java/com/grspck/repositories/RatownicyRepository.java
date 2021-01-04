package com.grspck.repositories;

import com.grspck.models.Ratownicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface RatownicyRepository extends JpaRepository<Ratownicy, Integer>
{
}
