package com.example.Evidencia2.ServiceImp;
import com.example.Evidencia2.Model.User;
import com.example.Evidencia2.Repository.UserRepository;
import com.example.Evidencia2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        if (user.getHeight() < 1 || user.getHeight() > 2.5) {
            throw new IllegalArgumentException("Height must be between 1 meter and 2.5 meters.");
        }

        if (user.getAge() < 15) {
            throw new IllegalArgumentException("Age must be 15 years or older.");
        }

        return userRepository.save(user);
    }

    @Override
    public User loginUser(String username, String password) {
        return userRepository.findByUsername(username);
    }
}
