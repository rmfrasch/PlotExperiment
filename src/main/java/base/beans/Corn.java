package base.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Corn {
	@Column(name="relativematurity")
	private int relativeMaturity;
	private boolean hybrid;
	@Column(name="anthocyaninroots")
	private boolean anthocyaninRoots;

	public Corn(int relativeMaturity, boolean hybrid, boolean anthocyaninRoots) {
		super();
		this.relativeMaturity = relativeMaturity;
		this.hybrid = hybrid;
		this.anthocyaninRoots = anthocyaninRoots;
	}

	public Corn() {

	}

	public int getRelativeMaturity() {
		return relativeMaturity;
	}

	public void setRelativeMaturity(int relativeMaturity) {
		this.relativeMaturity = relativeMaturity;
	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}

	public boolean isAnthocyaninRoots() {
		return anthocyaninRoots;
	}

	public void setAnthocyaninRoots(boolean anthocyaninRoots) {
		this.anthocyaninRoots = anthocyaninRoots;
	}

	@Override
	public String toString() {
		return "Corn [relativeMaturity=" + relativeMaturity + ", hybrid=" + hybrid + ", anthocyaninRoots="
				+ anthocyaninRoots + "]";
	}

}
