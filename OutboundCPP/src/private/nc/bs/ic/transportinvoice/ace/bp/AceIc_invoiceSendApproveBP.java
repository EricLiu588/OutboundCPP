package nc.bs.ic.transportinvoice.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceIc_invoiceSendApproveBP {
	/**
	 * ������
	 * 
	 * @param vos
	 *            ����VO����
	 * @param script
	 *            ���ݶ����ű�����
	 * @return �����ĵ���VO����
	 */

	public AggIc_invoice_h[] sendApprove(AggIc_invoice_h[] clientBills,
			AggIc_invoice_h[] originBills) {
		for (AggIc_invoice_h clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���ݳ־û�
		AggIc_invoice_h[] returnVos = new BillUpdate<AggIc_invoice_h>().update(
				clientBills, originBills);
		return returnVos;
	}
}
