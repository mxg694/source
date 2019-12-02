package provider.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import provider.pojo.User;

public interface UserMapper extends JpaRepository<User,Long> {
}
