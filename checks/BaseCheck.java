public class BaseCheck {
 public static void main(String[] args) throws Exception {

 CheckSupport.equal(conversióndebases.convertidores.decimalABinario("0"),"0");
 CheckSupport.equal(conversióndebases.convertidores.binarioADecimal("000101"),"5");
 java.util.Random random=new java.util.Random(44);
 for(int i=0;i<250;i++){
  String decimal=new java.math.BigInteger(2048,random).toString();
  CheckSupport.equal(conversióndebases.convertidores.binarioADecimal(conversióndebases.convertidores.decimalABinario(decimal)),decimal);
 }
 for(String bad:new String[]{"", "-1", "102", "1.5", "word"})try{conversióndebases.convertidores.binarioADecimal(bad);throw new AssertionError("Accepted invalid input");}catch(IllegalArgumentException expected){}
 try{conversióndebases.convertidores.decimalABinario(new String(new char[4097]).replace('\0','1'));throw new AssertionError();}catch(IllegalArgumentException expected){}

 CheckSupport.done();
 }
}
