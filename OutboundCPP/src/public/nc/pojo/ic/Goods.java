package nc.pojo.ic;

public class Goods {
	private String goodsNo;
	private String goodsName;
	private String goodsSpecification;
	private String goodsModel;
	private String goodsBatch;
	private String goodsNum;
	private String goodsUnit;
	private String goodsPrice;
	
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsSpecification() {
		return goodsSpecification;
	}
	public void setGoodsSpecification(String goodsSpecification) {
		this.goodsSpecification = goodsSpecification;
	}
	public String getGoodsModel() {
		return goodsModel;
	}
	public void setGoodsModel(String goodsModel) {
		this.goodsModel = goodsModel;
	}
	public String getGoodsBatch() {
		return goodsBatch;
	}
	public void setGoodsBatch(String goodsBatch) {
		this.goodsBatch = goodsBatch;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsUnit() {
		return goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Goods(String goodsNo){
		this.goodsNo = goodsNo;
		this.goodsName = "";
		this.goodsSpecification = "";
		this.goodsModel = "";
		this.goodsBatch = "";
		this.goodsNum = "";
		this.goodsPrice = "";
		this.goodsUnit = "";
	}
	public Goods(String goodsNo, String goodsName, String goodsSpecification,
			String goodsModel, String goodsBatch, String goodsNum,
			String goodsUnit, String goodsPrice) {
		super();
		this.goodsNo = goodsNo;
		this.goodsName = goodsName;
		this.goodsSpecification = goodsSpecification;
		this.goodsModel = goodsModel;
		this.goodsBatch = goodsBatch;
		this.goodsNum = goodsNum;
		this.goodsUnit = goodsUnit;
		this.goodsPrice = goodsPrice;
	}
}
