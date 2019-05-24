//package com.hsr.demo.application.service;
//
//import com.hsr.demo.application.model.User;
//import com.hsr.demo.application.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.Collection;
//@Service
//@Transactional
//public class HotelUserDetailsService implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Username " + username + " not found"));
//        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),getAuthorities(user));
//    }
//    private static  Collection<? extends GrantedAuthority> getAuthorities(User user) {
//     String userRoles=user.getRole();
//        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
//   return authorities;
//    }
//}
