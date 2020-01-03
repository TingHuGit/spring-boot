/**   
 * @ClassName:  DemoDao   
 * @Description:使用JdbcTemplate操作数据库
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月17日 下午4:45:21   
 *   
 */
package org.tinghu.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.tinghu.domain.Demo;

@Repository
public class DemoDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	/**
	 * @Title: getById   
	 * @Description: 通过id获取demo对象. 
	 * @param id
	 * @return Demo          
	 * @throws
	 */
	public Demo getById(long id) {
		String sql = "select * from Demo where id=?";
		RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
}
