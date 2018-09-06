/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年9月5日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.importExcel.pojo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年9月5日  
*/
public class User {
	
	@Excel(name="id")
	@NotBlank(message="该字段不能为空")
	private String id;
	
	@Excel(name="姓名")
	@Pattern(regexp = "[\\u4E00-\\u9FA5]{2,5}", message = "姓名中文2-5位")
	private String name;
	
	@Max(value=20)
	@Excel(name = "年龄")
	private Integer age;
	
	@Excel(name = "生日", importFormat = "yyyy-MM-dd")
	private Date birthDay;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
}
