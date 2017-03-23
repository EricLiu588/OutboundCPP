package nc.vo.ic.ic_invoice;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2017-3-17
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class Ic_invoice_b extends SuperVO {
	
/**
*物流发货单子表主键
*/
public String pk_invoice_b;
/**
*行号
*/
public String rowno;
/**
*物料基本分类
*/
public String pk_marbasclass;
/**
*批次号
*/
public String batchnumber;
/**
*主数量
*/
public String mainquantity;
/**
*辅数量
*/
public String auxiliaryquantity;
/**
*特殊要求
*/
public String specialrequirements;
/**
*物流接口方式
*/
public String interfacetype;
/**
*物流运输单号
*/
public String transportnumber;
/**
*物流运输子号
*/
public String transportnumber_li;
/**
*自定义项1
*/
public String def1;
/**
*自定义项2
*/
public String def2;
/**
*自定义项3
*/
public String def3;
/**
*自定义项4
*/
public String def4;
/**
*自定义项5
*/
public String def5;
/**
*自定义项6
*/
public String def6;
/**
*自定义项7
*/
public String def7;
/**
*自定义项8
*/
public String def8;
/**
*自定义项9
*/
public String def9;
/**
*自定义项10
*/
public String def10;
/**
*自定义项11
*/
public String def11;
/**
*自定义项12
*/
public String def12;
/**
*自定义项13
*/
public String def13;
/**
*自定义项14
*/
public String def14;
/**
*自定义项15
*/
public String def15;
/**
*自定义项16
*/
public String def16;
/**
*自定义项17
*/
public String def17;
/**
*自定义项18
*/
public String def18;
/**
*自定义项19
*/
public String def19;
/**
*自定义项20
*/
public String def20;
/**
*运输方式
*/
public String ctransporttypeid;
/**
*上层单据主键
*/
public String pk_invoice_h;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_invoice_b的Getter方法.属性名：物流发货单子表主键
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getPk_invoice_b() {
return this.pk_invoice_b;
} 

/**
* 属性pk_invoice_b的Setter方法.属性名：物流发货单子表主键
* 创建日期:2017-3-17
* @param newPk_invoice_b java.lang.String
*/
public void setPk_invoice_b ( String pk_invoice_b) {
this.pk_invoice_b=pk_invoice_b;
} 
 
/**
* 属性 rowno的Getter方法.属性名：行号
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getRowno() {
return this.rowno;
} 

/**
* 属性rowno的Setter方法.属性名：行号
* 创建日期:2017-3-17
* @param newRowno java.lang.String
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
} 
 
/**
* 属性 pk_marbasclass的Getter方法.属性名：物料基本分类
*  创建日期:2017-3-17
* @return nc.vo.bd.material.marbasclass.MarBasClassVO
*/
public String getPk_marbasclass() {
return this.pk_marbasclass;
} 

/**
* 属性pk_marbasclass的Setter方法.属性名：物料基本分类
* 创建日期:2017-3-17
* @param newPk_marbasclass nc.vo.bd.material.marbasclass.MarBasClassVO
*/
public void setPk_marbasclass ( String pk_marbasclass) {
this.pk_marbasclass=pk_marbasclass;
} 
 
/**
* 属性 batchnumber的Getter方法.属性名：批次号
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getBatchnumber() {
return this.batchnumber;
} 

/**
* 属性batchnumber的Setter方法.属性名：批次号
* 创建日期:2017-3-17
* @param newBatchnumber java.lang.String
*/
public void setBatchnumber ( String batchnumber) {
this.batchnumber=batchnumber;
} 
 
/**
* 属性 mainquantity的Getter方法.属性名：主数量
*  创建日期:2017-3-17
* @return nc.vo.pub.lang.UFDouble
*/
public String getMainquantity() {
return this.mainquantity;
} 

/**
* 属性mainquantity的Setter方法.属性名：主数量
* 创建日期:2017-3-17
* @param newMainquantity nc.vo.pub.lang.UFDouble
*/
public void setMainquantity ( String mainquantity) {
this.mainquantity=mainquantity;
} 
 
/**
* 属性 auxiliaryquantity的Getter方法.属性名：辅数量
*  创建日期:2017-3-17
* @return nc.vo.pub.lang.UFDouble
*/
public String getAuxiliaryquantity() {
return this.auxiliaryquantity;
} 

/**
* 属性auxiliaryquantity的Setter方法.属性名：辅数量
* 创建日期:2017-3-17
* @param newAuxiliaryquantity nc.vo.pub.lang.UFDouble
*/
public void setAuxiliaryquantity ( String auxiliaryquantity) {
this.auxiliaryquantity=auxiliaryquantity;
} 
 
/**
* 属性 specialrequirements的Getter方法.属性名：特殊要求
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getSpecialrequirements() {
return this.specialrequirements;
} 

/**
* 属性specialrequirements的Setter方法.属性名：特殊要求
* 创建日期:2017-3-17
* @param newSpecialrequirements java.lang.String
*/
public void setSpecialrequirements ( String specialrequirements) {
this.specialrequirements=specialrequirements;
} 
 
/**
* 属性 interfacetype的Getter方法.属性名：物流接口方式
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getInterfacetype() {
return this.interfacetype;
} 

/**
* 属性interfacetype的Setter方法.属性名：物流接口方式
* 创建日期:2017-3-17
* @param newInterfacetype java.lang.String
*/
public void setInterfacetype ( String interfacetype) {
this.interfacetype=interfacetype;
} 
 
/**
* 属性 transportnumber的Getter方法.属性名：物流运输单号
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getTransportnumber() {
return this.transportnumber;
} 

/**
* 属性transportnumber的Setter方法.属性名：物流运输单号
* 创建日期:2017-3-17
* @param newTransportnumber java.lang.String
*/
public void setTransportnumber ( String transportnumber) {
this.transportnumber=transportnumber;
} 
 
/**
* 属性 transportnumber_li的Getter方法.属性名：物流运输子号
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getTransportnumber_li() {
return this.transportnumber_li;
} 

/**
* 属性transportnumber_li的Setter方法.属性名：物流运输子号
* 创建日期:2017-3-17
* @param newTransportnumber_li java.lang.String
*/
public void setTransportnumber_li ( String transportnumber_li) {
this.transportnumber_li=transportnumber_li;
} 
 
/**
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2017-3-17
* @param newDef1 java.lang.String
*/
public void setDef1 ( String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2017-3-17
* @param newDef2 java.lang.String
*/
public void setDef2 ( String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2017-3-17
* @param newDef3 java.lang.String
*/
public void setDef3 ( String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2017-3-17
* @param newDef4 java.lang.String
*/
public void setDef4 ( String def4) {
this.def4=def4;
} 
 
/**
* 属性 def5的Getter方法.属性名：自定义项5
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef5() {
return this.def5;
} 

/**
* 属性def5的Setter方法.属性名：自定义项5
* 创建日期:2017-3-17
* @param newDef5 java.lang.String
*/
public void setDef5 ( String def5) {
this.def5=def5;
} 
 
/**
* 属性 def6的Getter方法.属性名：自定义项6
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef6() {
return this.def6;
} 

/**
* 属性def6的Setter方法.属性名：自定义项6
* 创建日期:2017-3-17
* @param newDef6 java.lang.String
*/
public void setDef6 ( String def6) {
this.def6=def6;
} 
 
/**
* 属性 def7的Getter方法.属性名：自定义项7
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef7() {
return this.def7;
} 

/**
* 属性def7的Setter方法.属性名：自定义项7
* 创建日期:2017-3-17
* @param newDef7 java.lang.String
*/
public void setDef7 ( String def7) {
this.def7=def7;
} 
 
/**
* 属性 def8的Getter方法.属性名：自定义项8
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef8() {
return this.def8;
} 

/**
* 属性def8的Setter方法.属性名：自定义项8
* 创建日期:2017-3-17
* @param newDef8 java.lang.String
*/
public void setDef8 ( String def8) {
this.def8=def8;
} 
 
/**
* 属性 def9的Getter方法.属性名：自定义项9
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef9() {
return this.def9;
} 

/**
* 属性def9的Setter方法.属性名：自定义项9
* 创建日期:2017-3-17
* @param newDef9 java.lang.String
*/
public void setDef9 ( String def9) {
this.def9=def9;
} 
 
/**
* 属性 def10的Getter方法.属性名：自定义项10
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef10() {
return this.def10;
} 

/**
* 属性def10的Setter方法.属性名：自定义项10
* 创建日期:2017-3-17
* @param newDef10 java.lang.String
*/
public void setDef10 ( String def10) {
this.def10=def10;
} 
 
/**
* 属性 def11的Getter方法.属性名：自定义项11
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef11() {
return this.def11;
} 

/**
* 属性def11的Setter方法.属性名：自定义项11
* 创建日期:2017-3-17
* @param newDef11 java.lang.String
*/
public void setDef11 ( String def11) {
this.def11=def11;
} 
 
/**
* 属性 def12的Getter方法.属性名：自定义项12
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef12() {
return this.def12;
} 

/**
* 属性def12的Setter方法.属性名：自定义项12
* 创建日期:2017-3-17
* @param newDef12 java.lang.String
*/
public void setDef12 ( String def12) {
this.def12=def12;
} 
 
/**
* 属性 def13的Getter方法.属性名：自定义项13
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef13() {
return this.def13;
} 

/**
* 属性def13的Setter方法.属性名：自定义项13
* 创建日期:2017-3-17
* @param newDef13 java.lang.String
*/
public void setDef13 ( String def13) {
this.def13=def13;
} 
 
/**
* 属性 def14的Getter方法.属性名：自定义项14
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef14() {
return this.def14;
} 

/**
* 属性def14的Setter方法.属性名：自定义项14
* 创建日期:2017-3-17
* @param newDef14 java.lang.String
*/
public void setDef14 ( String def14) {
this.def14=def14;
} 
 
/**
* 属性 def15的Getter方法.属性名：自定义项15
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef15() {
return this.def15;
} 

/**
* 属性def15的Setter方法.属性名：自定义项15
* 创建日期:2017-3-17
* @param newDef15 java.lang.String
*/
public void setDef15 ( String def15) {
this.def15=def15;
} 
 
/**
* 属性 def16的Getter方法.属性名：自定义项16
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef16() {
return this.def16;
} 

/**
* 属性def16的Setter方法.属性名：自定义项16
* 创建日期:2017-3-17
* @param newDef16 java.lang.String
*/
public void setDef16 ( String def16) {
this.def16=def16;
} 
 
/**
* 属性 def17的Getter方法.属性名：自定义项17
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef17() {
return this.def17;
} 

/**
* 属性def17的Setter方法.属性名：自定义项17
* 创建日期:2017-3-17
* @param newDef17 java.lang.String
*/
public void setDef17 ( String def17) {
this.def17=def17;
} 
 
/**
* 属性 def18的Getter方法.属性名：自定义项18
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef18() {
return this.def18;
} 

/**
* 属性def18的Setter方法.属性名：自定义项18
* 创建日期:2017-3-17
* @param newDef18 java.lang.String
*/
public void setDef18 ( String def18) {
this.def18=def18;
} 
 
/**
* 属性 def19的Getter方法.属性名：自定义项19
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef19() {
return this.def19;
} 

/**
* 属性def19的Setter方法.属性名：自定义项19
* 创建日期:2017-3-17
* @param newDef19 java.lang.String
*/
public void setDef19 ( String def19) {
this.def19=def19;
} 
 
/**
* 属性 def20的Getter方法.属性名：自定义项20
*  创建日期:2017-3-17
* @return java.lang.String
*/
public String getDef20() {
return this.def20;
} 

/**
* 属性def20的Setter方法.属性名：自定义项20
* 创建日期:2017-3-17
* @param newDef20 java.lang.String
*/
public void setDef20 ( String def20) {
this.def20=def20;
} 
 
/**
* 属性 ctransporttypeid的Getter方法.属性名：运输方式
*  创建日期:2017-3-17
* @return nc.vo.bd.transporttype.TransportTypeVO
*/
public String getCtransporttypeid() {
return this.ctransporttypeid;
} 

/**
* 属性ctransporttypeid的Setter方法.属性名：运输方式
* 创建日期:2017-3-17
* @param newCtransporttypeid nc.vo.bd.transporttype.TransportTypeVO
*/
public void setCtransporttypeid ( String ctransporttypeid) {
this.ctransporttypeid=ctransporttypeid;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2017-3-17
* @return String
*/
public String getPk_invoice_h(){
return this.pk_invoice_h;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2017-3-17
* @param newPk_invoice_h String
*/
public void setPk_invoice_h(String pk_invoice_h){
this.pk_invoice_h=pk_invoice_h;
} 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2017-3-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2017-3-17
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("ic.ic_invoice_b");
    }
   }
    