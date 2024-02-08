package br.com.edjunior.userpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edjunior.userpool.entity.UserEntity;

public interface UserRepoitory extends JpaRepository<UserEntity, Long> {

    
} 