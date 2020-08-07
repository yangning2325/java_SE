package fanxing.hashset;

public class People {
	String num;
	String name;
	public People(String num, String name) {
		this.num = num;
		this.name = name;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((num == null) ? 0 : num.hashCode());
//		return result;
//	}
	public int hashCode() {
		return num.hashCode();
	}
	@Override
	public String toString() {
		return "People [num=" + num + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof People))
			return false;
		People other = (People) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}


}
