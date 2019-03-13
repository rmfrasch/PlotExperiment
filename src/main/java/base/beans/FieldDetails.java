package base.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity(name="fielddetails")
public class FieldDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="plotpopulation")
	private double plotPopulation;
	@Column(name="plotrownumber")
	private int plotRowNumber;
	@Column(name="plotrowlength")
	private int plotRowLength;
	@Autowired
	private Corn corn;

	public FieldDetails(double plotPopulation, int plotRowNumber, int plotRowLength, Corn corn) {
		super();
		this.plotPopulation = plotPopulation;
		this.plotRowNumber = plotRowNumber;
		this.plotRowLength = plotRowLength;
		this.corn = corn;
	}
	public FieldDetails(double plotPopulation, int plotRowNumber, int plotRowLength) {
		super();
		this.plotPopulation = plotPopulation;
		this.plotRowNumber = plotRowNumber;
		this.plotRowLength = plotRowLength;
	}

	public FieldDetails() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPlotPopulation() {
		return plotPopulation;
	}

	public void setPlotPopulation(double plotPopulation) {
		this.plotPopulation = plotPopulation;
	}

	public int getPlotRowNumber() {
		return plotRowNumber;
	}

	public void setPlotRowNumber(int plotRowNumber) {
		this.plotRowNumber = plotRowNumber;
	}

	public int getPlotRowLength() {
		return plotRowLength;
	}

	public void setPlotRowLength(int plotRowLength) {
		this.plotRowLength = plotRowLength;
	}

	public Corn getCorn() {
		return corn;
	}

	public void setCorn(Corn corn) {
		this.corn = corn;
	}

	@Override
	public String toString() {
		return "FieldDetails [id=" + id + ", plotPopulation=" + plotPopulation + ", plotRowNumber=" + plotRowNumber
				+ ", plotRowLength=" + plotRowLength + "]";
	}

}
