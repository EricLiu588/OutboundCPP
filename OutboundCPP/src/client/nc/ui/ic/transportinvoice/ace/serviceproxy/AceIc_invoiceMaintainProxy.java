package nc.ui.ic.transportinvoice.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.ic.IIc_invoiceMaintain;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceIc_invoiceMaintainProxy implements IQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IIc_invoiceMaintain query = NCLocator.getInstance().lookup(
				IIc_invoiceMaintain.class);
		return query.query(queryScheme);
	}

}