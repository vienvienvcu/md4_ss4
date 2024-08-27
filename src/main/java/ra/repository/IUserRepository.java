package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.entity.Users;

import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    Optional<Users>findByEmail(String email);
    Optional<Users> findByPhone(String phone); // Thêm phương thức tìm theo phone xem co ton tai chua
    Optional<Users> findByUserName(String userName); // Thêm phương thức tìm theo username xem da ton tai chua?
    boolean existsByPhone(String phone);
}
