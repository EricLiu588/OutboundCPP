package nc.bs.ic.transportinvoice.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceIc_invoiceUnSendApproveBP {

	public AggIc_invoice_h[] unSend(AggIc_invoice_h[] clientBills,
			AggIc_invoice_h[] originBills) {
		// 把VO持久化到数据库中
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggIc_invoice_h> update = new BillUpdate<AggIc_invoice_h>();
		AggIc_invoice_h[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggIc_invoice_h[] clientBills) {
		for (AggIc_invoice_h clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
