package main;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Main {
   private String name;
   @Id
   private int id;
        public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}