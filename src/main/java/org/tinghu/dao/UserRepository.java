package org.tinghu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.tinghu.domain.User;

/**   
 * @ClassName:  UserRepository   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月17日 下午4:40:08   
 * 
 *  extends JpaRepository<User, Long>
 *  Long 是数据库表的主键，一般为Integer或者Long
 */
public interface UserRepository extends JpaRepository<User, Long> {
		
	/**
	 * @Title: findByUserName   
	 * @Description: 通过姓名查用户
	 * @param userName
	 * @return User          
	 * @throws
	 */
	User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}