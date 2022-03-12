package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book12")
public class BookEntity {
	
	@Id
	@Column
	private int id;
	@Column
	private int cost;
	@Column
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", cost=" + cost + ", name=" + name + "]";
	}
	public BookEntity(int id, int cost, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
