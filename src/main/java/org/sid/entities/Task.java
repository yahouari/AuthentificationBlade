package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Task {
	@Id @GeneratedValue
	private Long id;
	private String taskName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(Long id, String taskName) {
		super();
		this.id = id;
		this.taskName = taskName;
	}

}
