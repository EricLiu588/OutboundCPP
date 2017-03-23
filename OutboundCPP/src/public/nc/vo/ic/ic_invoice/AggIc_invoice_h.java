package nc.vo.ic.ic_invoice;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.ic.ic_invoice.Ic_invoice_h")

public class AggIc_invoice_h extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggIc_invoice_hMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public Ic_invoice_h getParentVO(){
	  	return (Ic_invoice_h)this.getParent();
	  }
	  
}