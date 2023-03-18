package ru.netology.diplom.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.diplom.entity.CloudFileEntity;
import ru.netology.diplom.entity.UserEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface CloudRepository extends JpaRepository<CloudFileEntity, Integer> {

    Optional<List<CloudFileEntity>> findAllFilesByUser(UserEntity byLogin);

    void removeFileByName(String fileName);

    Optional<CloudFileEntity> findByName(String filename);
}
