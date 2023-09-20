package cascadeonetoonee2.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private VoterCard voterCard;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public VoterCard getVoterCard() {
		return voterCard;
	}
	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", voterCard=" + voterCard + "]";
	}
	
}
