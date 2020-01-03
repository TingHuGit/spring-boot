/**
 * 
 */
package org.tinghu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**   
 * @ClassName:  Demo   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月17日 下午4:47:26   
 *   
 */
@Entity
public class Demo {
	@Id
    private Long id;//主键.
    private String name;//测试名称.  
    public Long getId() {  
       return id;  
    }  
    public void setId(long id) {  
       this.id = id;  
    }  
    public String getName() {  
       return name;  
    }  
    public void setName(String name) {  
       this.name = name;  
    }  
}  
