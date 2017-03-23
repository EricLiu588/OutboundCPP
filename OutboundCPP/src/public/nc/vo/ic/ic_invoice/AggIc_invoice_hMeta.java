package nc.vo.ic.ic_invoice;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggIc_invoice_hMeta extends AbstractBillMeta{
	
	public AggIc_invoice_hMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.ic.ic_invoice.Ic_invoice_h.class);
		this.addChildren(nc.vo.ic.ic_invoice.Ic_invoice_b.class);
	}
}