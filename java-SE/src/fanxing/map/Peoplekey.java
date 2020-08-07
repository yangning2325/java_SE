package fanxing.map;

public class Peoplekey {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Peoplekey))
			return false;
		Peoplekey other = (Peoplekey) obj;
		if (id != other.id)
			return false;
		return true;
	}

	int id;

	public Peoplekey(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Peoplekey [id=" + id + "]";
	}
}
