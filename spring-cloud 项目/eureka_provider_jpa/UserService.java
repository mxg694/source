package provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import provider.mapper.UserMapper;
import provider.pojo.User;

@Service
public class UserService {

    @Autowired
   private UserMapper userMapper;

    public Long save(User user) {
        User save = userMapper.save(user);
        if (user !=null) {
            return user.getId();
        }
        return null;
    }
}
