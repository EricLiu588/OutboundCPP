package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.ic.transportinvoice.plugin.bpplugin.Ic_invoicePluginPoint;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.itf.ic.IIc_invoiceMaintain;

public class N_OCPP_SAVEBASE extends AbstractPfAction<AggIc_invoice_h> {

	@Override
	protected CompareAroundProcesser<AggIc_invoice_h> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggIc_invoice_h> processor = null;
		AggIc_invoice_h[] clientFullVOs = (AggIc_invoice_h[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggIc_invoice_h>(
					Ic_invoicePluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggIc_invoice_h>(
					Ic_invoicePluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggIc_invoice_h> rule = null;

		return processor;
	}

	@Override
	protected AggIc_invoice_h[] processBP(Object userObj,
			AggIc_invoice_h[] clientFullVOs, AggIc_invoice_h[] originBills) {

		AggIc_invoice_h[] bills = null;
		try {
			IIc_invoiceMaintain operator = NCLocator.getInstance()
					.lookup(IIc_invoiceMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs, originBills);
			} else {
				bills = operator.insert(clientFullVOs, originBills);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
