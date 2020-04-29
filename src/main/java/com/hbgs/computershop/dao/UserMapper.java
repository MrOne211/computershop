package com.hbgs.computershop.dao;

import com.hbgs.computershop.domain.SearchParam;
import com.hbgs.computershop.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component("/userMapper")
public interface UserMapper {
    User login(String username);

    User findUserById(String id);

    List<User> list(SearchParam searchParam);

    int addUser(User user);

    List<User> findImg(String img);

    int delete(SearchParam searchParam);

    List<User> findUsers(String username);

    int update(User user);

    User findUserByUsername(User user);

    int updatePass(User user);

    void updateState(SearchParam searchParam);

    void lock(SearchParam searchParam);

    void unlock(SearchParam searchParam);

    void lockById(int id);

    void updateRate(User user);
}
