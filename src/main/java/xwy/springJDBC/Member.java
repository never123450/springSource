package xwy.springJDBC;

import java.io.Serializable;

public class Member implements Serializable {
    private Long id;
	private String name;
	private String addr;
	private Long createTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
