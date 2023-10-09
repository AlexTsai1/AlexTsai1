//extend/modify as needed to complete the lab
public class Course {
	String accr, number, title, desc, prereq;
	public Course(String accr, String number, String title, String desc, String prereq) {
		this.accr = new String(accr);
		this.number = new String(number);
		this.title = new String(title);
		this.desc = new String(desc);
		this.prereq = new String(prereq);
	}
	public String getAccr() {
		return accr;
	}
	public void setAccr(String accr) {
		this.accr = accr;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	public int compareTo(Course other) {
		return this.number.compareTo(other.number);
	}
}