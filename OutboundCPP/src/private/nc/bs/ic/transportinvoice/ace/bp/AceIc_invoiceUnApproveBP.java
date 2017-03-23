package nc.bs.ic.transportinvoice.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceIc_invoiceUnApproveBP {

	public AggIc_invoice_h[] unApprove(AggIc_invoice_h[] clientBills,
			AggIc_invoice_h[] originBills) {
		for (AggIc_invoice_h clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggIc_invoice_h> update = new BillUpdate<AggIc_invoice_h>();
		AggIc_invoice_h[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}
}
