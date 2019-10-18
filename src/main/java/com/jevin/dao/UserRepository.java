package com.jevin.dao;

import com.jevin.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *  @项目名：  StudentInfoManger
 *  @包名：    com.jevin.dao
 *  @文件名:   UserRepository
 *  @创建者:   85169
 *  @创建时间:  2019/10/18 15:30
 *  @描述：    TODO
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //通过studentId查询学生
    List<User> findUserByStudentId(String studentId);

    //通过id查找用户
    User findUserById(int id);

}
