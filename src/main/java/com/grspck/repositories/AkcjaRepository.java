package com.grspck.repositories;

import com.grspck.models.Akcje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface AkcjaRepository extends JpaRepository<Akcje, Integer>
{
}
