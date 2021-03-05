package com.example.examSystem.mapper;

import com.example.examSystem.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findById(Integer id);

    @Delete("delete from user where id = #{id}")
    public int deleteById(int id);

    @Update("update user set name = #{name},class_name = #{class_name}," +
            "user_group = #{user_group}, username = #{username},password = #{password},token = #{token},token_time = #{token_time} where id = #{id}")
    public int update(User user);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(name,class_name,user_group,username,password) " +
            "values(#{name},#{class_name},#{user_group},#{username},#{password})")
    public int add(User user);
    
    @Select("select * from user where username = #{username} and password = #{password}")
    public User login(String username,String password);
}
