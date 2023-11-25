package com.example.Evidencia2.Service;
import com.example.Evidencia2.Model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User loginUser(String username, String password);
}
