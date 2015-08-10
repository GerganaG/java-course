package hashSetTown;

public class Town {

	private String nameOfTown;
	private String nameOfCountry;
	private long population;
		
	public Town(String nameOfTown, String nameOfCountry, long population) {
		this.nameOfTown = nameOfTown;
		this.nameOfCountry = nameOfCountry;
		this.population = population;
	}
	public Town(String nameOfTown) {
		this.nameOfTown = nameOfTown;
		this.nameOfCountry = "";
		this.population = 0L;
	}
	
	public String getNameOfTown() {
		return nameOfTown;
	}

	public void setNameOfTown(String nameOfTown) {
		this.nameOfTown = nameOfTown;
	}

	public String getNameOfCountry() {
		return nameOfCountry;
	}

	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	@Override
	public int hashCode() {
		return (this.nameOfCountry + this.nameOfTown).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (nameOfCountry == null) {
			if (other.nameOfCountry != null)
				return false;
		} else if (!nameOfCountry.equals(other.nameOfCountry))
			return false;
		if (nameOfTown == null) {
			if (other.nameOfTown != null)
				return false;
		} else if (!nameOfTown.equals(other.nameOfTown))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Town - " + this.nameOfTown + ", country - " + this.nameOfCountry + ", population - " + this.population;
	}
}
