package de.dhbwka.database.objectrelational;

import javax.persistence.*;


@Entity
@Table(name="polyeder")
public class Polyeder
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;

	public String name;
 
	public Polyeder() {
		// default constructor for Mapping
	}
    
	public double getPerimeter() {
		return 0.0;
	}
      
	@Override
	public String toString() {
		return String.format("POL(%d,%s)", id, name);
	}
}