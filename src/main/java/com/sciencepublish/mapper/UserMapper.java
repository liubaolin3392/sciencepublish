package com.sciencepublish.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.sciencepublish.model.User;

@Mapper
public interface UserMapper {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    List<User> getAllUser();

    User getUserByUserId(@Param("userId") String userId);
}
