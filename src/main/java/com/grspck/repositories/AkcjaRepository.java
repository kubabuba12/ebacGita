package com.grspck.repositories;

import com.grspck.models.Akcje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AkcjaRepository extends JpaRepository<Akcje, Integer>
{
}
