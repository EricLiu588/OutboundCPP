package nc.ui.ic.transportinvoice.ace.action;

import java.awt.event.ActionEvent;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.heroliu.httputils.HttpRequest;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IVOPersistence;
import nc.pojo.ic.Sale;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.model.BillManageModel;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.ic.ic_invoice.Ic_invoice_b;
import nc.vo.ic.ic_invoice.Ic_invoice_h;

public class CancelBillAction extends NCAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4530450604566088408L;
	private final String code = "canelBillAction";
	private final String btnName = "取消下单";
	private BillManageModel model;
	private IVOPersistence dao = NCLocator.getInstance().lookup(
			IVOPersistence.class);

	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
		this.model.addAppEventListener(this);
	}

	public CancelBillAction() {
		this.setCode(code);
		this.setBtnName(btnName);
	}
	
	@Override
	protected boolean isActionEnable() {
		// TODO 自动生成的方法存根
		boolean flag = false;
		if(null != model.getSelectedData()){
			AggIc_invoice_h vo = (AggIc_invoice_h)model.getSelectedData();
			if(vo.getParentVO().getAttributeValue("def1").toString().equals("0")){
				flag = true;
			}
		}
		return flag;
	}
	
	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		AggIc_invoice_h vo = (AggIc_invoice_h)model.getSelectedData();
		Ic_invoice_h invoice_hvo = vo.getParentVO();
		Ic_invoice_b[] invoice_bvo = (Ic_invoice_b[]) vo.getAllChildrenVO();
		// 下单操作
		HashMap<String, String> sha1Map = new HashMap<String, String>();
		sha1Map.put("mergeNo", "20170321132201");
		sha1Map.put("carrierId", "15e7926393314114a4e83005bfc88c6f");
		sha1Map.put("receiveAddress", "天津市和平区");
		Sale sale = new Sale("55534221235");
		sha1Map.put("saleNo", sale.getSaleNo());
		sha1Map.put("appkey", "7584909e6f3d4e3d9a6859586f7cd81f");
		sha1Map.put("appsecret", "351f745566854a3f9b76a03d2e33c543");
		sha1Map.put("timestamp", System.currentTimeMillis() + "");
		sha1Map.put("dataType", "json");
		String s = HttpRequest.sendPost(
		"http://tms.scmsafe.com/tms/order/submit/v1.0",
		sha1Map);
		JSONObject jsonObject = JSONObject.parseObject(s);
		if (jsonObject.get("message") != null) {
			invoice_hvo.setAttributeValue("transportnumber","");
			invoice_hvo.setAttributeValue("def1", "1");
			for(int i = 0; i < invoice_bvo.length;i++){
				invoice_bvo[i].setTransportnumber("");
				invoice_bvo[i].setDef1("1");
				invoice_bvo[i].setAttributeValue("dr", "0");
			}
		}else{
			invoice_hvo.setAttributeValue("transportnumber", "下单失败");
		}
		invoice_hvo.setAttributeValue("dr", "0");
		dao.updateVO(invoice_hvo);
		dao.updateVOArray(invoice_bvo);
		this.model.directlyUpdate(vo);
	}
}
