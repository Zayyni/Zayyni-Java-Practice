package com.zayyni.securityapplication.services;

import com.zayyni.securityapplication.dto.LoginDto;
import com.zayyni.securityapplication.dto.SignUpDto;
import com.zayyni.securityapplication.dto.UserDto;
import com.zayyni.securityapplication.entities.User;
import com.zayyni.securityapplication.exceptions.ResourceNotFoundException;
import com.zayyni.securityapplication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new BadCredentialsException("User with email " + username + " not found"));
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found"));
    }

    public UserDto signUp(SignUpDto signUpDto) {
         Optional<User> user = userRepository.findByEmail(signUpDto.getEmail());
         if (user.isPresent()) {
             throw new BadCredentialsException("Email already in use" + signUpDto.getEmail());
         }

        User toBeCreateCreated = modelMapper.map(signUpDto, User.class);
         toBeCreateCreated.setPassword(passwordEncoder.encode(toBeCreateCreated.getPassword()));
        User savedUser = userRepository.save(toBeCreateCreated);
        return modelMapper.map(savedUser, UserDto.class);
    }
}
