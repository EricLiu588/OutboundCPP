package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.ic.transportinvoice.plugin.bpplugin.Ic_invoicePluginPoint;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.itf.ic.IIc_invoiceMaintain;

public class N_OCPP_UNAPPROVE extends AbstractPfAction<AggIc_invoice_h> {

	@Override
	protected CompareAroundProcesser<AggIc_invoice_h> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggIc_invoice_h> processor = new CompareAroundProcesser<AggIc_invoice_h>(
				Ic_invoicePluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
		processor.addBeforeRule(new UnapproveStatusCheckRule());

		return processor;
	}

	@Override
	protected AggIc_invoice_h[] processBP(Object userObj,
			AggIc_invoice_h[] clientFullVOs, AggIc_invoice_h[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggIc_invoice_h[] bills = null;
		try {
			IIc_invoiceMaintain operator = NCLocator.getInstance()
					.lookup(IIc_invoiceMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
