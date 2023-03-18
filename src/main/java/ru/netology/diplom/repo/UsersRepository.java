package ru.netology.diplom.repo;


import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.diplom.entity.UserEntity;


@Repository
@Transactional
public interface UsersRepository extends JpaRepository<UserEntity, Integer> {

    @NotNull UserEntity save(@NotNull UserEntity userEntity);
    @Query("update UserEntity  set token=null where token = :token")
    @Modifying
    void removeToken(String token);
    UserEntity findByLogin (String login);
    @Modifying
    @Query("update UserEntity u set u.token = :token where u.login = :login")
    void addTokenToUser(String login, String token);
}