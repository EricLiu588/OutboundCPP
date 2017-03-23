package nc.bs.ic.transportinvoice.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据送审的BP
 */
public class AceIc_invoiceSendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public AggIc_invoice_h[] sendApprove(AggIc_invoice_h[] clientBills,
			AggIc_invoice_h[] originBills) {
		for (AggIc_invoice_h clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		AggIc_invoice_h[] returnVos = new BillUpdate<AggIc_invoice_h>().update(
				clientBills, originBills);
		return returnVos;
	}
}
