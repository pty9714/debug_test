package com.ssafy.corona.virus;

public class Corona extends Virus{
	public int spreadSpeed;

	public void Corona(String name, int level, int spreadSpeed) {
		setName(name);
		setLevel(level);
		setSpreadSpeed(spreadSpeed);
	}
	
	public int getSpreadSpeed() {
		return spreadSpeed;
	}
	public void setSpreadSpeed(int spreadSpeed) {
		this.spreadSpeed = spreadSpeed;
	}	
	public String toString(String name) {
		StringBuilder sb=new StringBuilder();
		sb.append(super.toString()).append("\t")
		  .append(getSpreadSpeed());
		return sb.toString();
	}
}