package hk1;

public class Score {
	private double eng;
	private double math;
	private double chn;
	private double avg;
	public Score(double eng, double math, double chn) {
		super();
		this.eng = eng;
		this.math = math;
		this.chn = chn;
		this.avg = (eng+math+chn)/3;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getChn() {
		return chn;
	}
	public void setChn(double chn) {
		this.chn = chn;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Score [eng=" + eng + ", math=" + math + ", chn=" + chn + ", avg=" + avg + "]";
	}
	
}
