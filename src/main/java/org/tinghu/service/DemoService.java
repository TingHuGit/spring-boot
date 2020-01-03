/**
 * 
 */
package org.tinghu.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinghu.dao.DemoDao;
import org.tinghu.dao.DemoRepository;
import org.tinghu.domain.Demo;

/**
 * 提供Demo服务类.
 * 
 * @ClassName: DemoService
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019年1月17日 下午4:54:52
 * 
 */

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;

	@Autowired
	private DemoDao demoDao;

	public void save(Demo demo) {
		demoRepository.save(demo);
	}

	public Demo getById(long id) {
		// demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
		return demoDao.getById(id);
	}
}
