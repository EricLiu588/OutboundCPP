package nc.pojo.ic;

public class Sale {
	private String saleNo;
	private String thermometerNo;
	private String receiptNotice;
	public String getSaleNo() {
		return saleNo;
	}
	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}
	public String getThermometerNo() {
		return thermometerNo;
	}
	public void setThermometerNo(String thermometerNo) {
		this.thermometerNo = thermometerNo;
	}
	public String getReceiptNotice() {
		return receiptNotice;
	}
	public void setReceiptNotice(String receiptNotice) {
		this.receiptNotice = receiptNotice;
	}
	public Sale(String saleNo){
		this.saleNo = saleNo;
		thermometerNo = "";
		receiptNotice = "";
	}
	public Sale(String saleNo,String thermometerNo,String receiptNotice){
		this.saleNo = saleNo;
		this.thermometerNo = thermometerNo;
		this.receiptNotice = receiptNotice;
	}
}
