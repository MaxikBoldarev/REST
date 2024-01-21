package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;
import ru.netology.rest.user.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class UserRepository {

    private final List<Users> listUsers = new ArrayList<>(Stream.of(
                    new Users("admin", "1111"),
                    new Users("manager", "2222"),
                    new Users("user", "3333"))
            .collect(Collectors.toList()));

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (Users listUser : listUsers) {
            if (listUser.getUser().equals(user) & listUser.getPassword().equals(password)) {
                return List.of(Authorities.READ);
            }
        }
        return List.of();
    }
}
