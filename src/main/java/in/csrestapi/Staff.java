package in.csrestapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private String mob;
   private String sub;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
}
