package nc.pojo.ic;

public class Material {
	private String icePackNum;
	private String foamBoxNum;
	private String turnoverBoxNum;
	
	public String getIcePackNum() {
		return icePackNum;
	}
	public void setIcePackNum(String icePackNum) {
		this.icePackNum = icePackNum;
	}
	public String getFoamBoxNum() {
		return foamBoxNum;
	}
	public void setFoamBoxNum(String foamBoxNum) {
		this.foamBoxNum = foamBoxNum;
	}
	public String getTurnoverBoxNum() {
		return turnoverBoxNum;
	}
	public void setTurnoverBoxNum(String turnoverBoxNum) {
		this.turnoverBoxNum = turnoverBoxNum;
	}
	public Material(String icePackNum, String foamBoxNum, String turnoverBoxNum) {
		super();
		this.icePackNum = icePackNum;
		this.foamBoxNum = foamBoxNum;
		this.turnoverBoxNum = turnoverBoxNum;
	}
	public Material() {
		this.icePackNum = "";
		this.foamBoxNum = "";
		this.turnoverBoxNum = "";
		// TODO Auto-generated constructor stub
	}
	
}
