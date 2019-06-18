package ua.nic.Cursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.Cursova.model.StaffsEntity;

/*
    Для того, щоб забезпечити взаємодію із БД,
    потрібно створити репозиторій для кожної сущності
*/
public interface IStaffsRepository extends JpaRepository<StaffsEntity, Long> {} 
