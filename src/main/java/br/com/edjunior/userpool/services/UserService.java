package br.com.edjunior.userpool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edjunior.userpool.dto.UserDTO;
import br.com.edjunior.userpool.entity.UserEntity;
import br.com.edjunior.userpool.repository.UserRepoitory;

@Service
public class UserService {
    
    @Autowired
    private UserRepoitory userRepoitory;

    public List<UserDTO> listAll() {
        List<UserEntity> user = userRepoitory.findAll();
        return user.stream().map(UserDTO::new).toList();    
    }

    public void create(UserDTO user) {
        UserEntity userEntity = new UserEntity(user);
        userRepoitory.save(userEntity);
    }

    public UserDTO update(UserDTO user) {
        UserEntity userEntity = new UserEntity(user);
        return new UserDTO(userRepoitory.save(userEntity));
    }

    public void delete(Long id) {
        UserEntity user = userRepoitory.findById(id).get();
        userRepoitory.delete(user);
    }

    public UserDTO findById(Long id) {
        return new UserDTO(userRepoitory.findById(id).get());
    }
}
