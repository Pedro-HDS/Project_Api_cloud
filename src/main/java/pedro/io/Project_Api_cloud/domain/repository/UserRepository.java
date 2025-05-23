package pedro.io.Project_Api_cloud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pedro.io.Project_Api_cloud.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}