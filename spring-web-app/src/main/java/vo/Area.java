package vo;

//@Entity
//@XmlRootElement (namespace = "com.rd.pojo.entity")
//@Table(name="areacode")
public class Area {

//	@Id
//	@Column(name="id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

//	@Column(name="pin_code")
	private String pinCode;
	private String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getPinCode() {
		return pinCode;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getPlace() {
		return place;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", pinCode=" + pinCode + ", place=" + place
				+ "]";
	}
}
