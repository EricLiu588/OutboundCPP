package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.ic.transportinvoice.plugin.bpplugin.Ic_invoicePluginPoint;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.itf.ic.IIc_invoiceMaintain;

public class N_OCPP_APPROVE extends AbstractPfAction<AggIc_invoice_h> {

	public N_OCPP_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggIc_invoice_h> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggIc_invoice_h> processor = new CompareAroundProcesser<AggIc_invoice_h>(
				Ic_invoicePluginPoint.APPROVE);
		processor.addBeforeRule(new ApproveStatusCheckRule());
		return processor;
	}

	@Override
	protected AggIc_invoice_h[] processBP(Object userObj,
			AggIc_invoice_h[] clientFullVOs, AggIc_invoice_h[] originBills) {
		AggIc_invoice_h[] bills = null;
		IIc_invoiceMaintain operator = NCLocator.getInstance().lookup(
				IIc_invoiceMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
