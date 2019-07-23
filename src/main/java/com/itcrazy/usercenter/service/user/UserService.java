package com.itcrazy.usercenter.service.user;

import com.itcrazy.usercenter.dao.user.UserMapper;
import com.itcrazy.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserMapper userMapper;

    public User findById(Integer id){
        //select * from user where id=#{id}
        return this.userMapper.selectByPrimaryKey(id);
    }
}