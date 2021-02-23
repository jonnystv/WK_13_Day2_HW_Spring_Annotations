package com.codeclan.example.Spring_Annotation.repositories;

import com.codeclan.example.Spring_Annotation.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
