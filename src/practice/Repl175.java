package practice;

public class Repl175 {

	public static void main(String[] args) {
		System.out.print(
			     lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
			     );
			     
			    System.out.print(
			     lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
			     );
			     
			    System.out.print(
			     lameDb("1tst#2bla#3foo","delete","2","")+"\n"
			     );
			     
			      System.out.print(
			     lameDb("1tst#2bla#3foo","none","1","")+"\n"
			     );

	}


public static String lameDb(String db, String op,String id,String data)
{
	String str=db;
    int num=Integer.parseInt(id);
    String temp=""+(num+1);
    if (op.equals("add")){
      str+="#"+id+data;
    }
    else if (db.contains(temp) && op.equals("edit")){
      str=db.replace(db.substring(db.indexOf(id) , db.indexOf(temp)), (id+""+data+"#"));
    }
    else if(db.contains(temp) && op.equals("delete")){
       str=db.replace(db.substring(db.indexOf(id) , db.indexOf(temp)), ("#"));
    }
    else if (!(db.contains(temp)) && op.equals("edit")){
      str=db.replace(db.substring(db.indexOf(id) , db.length()), (id+""+data));
    }
    else if(!(db.contains(temp)) && op.equals("delete")){
       str=db.replace(db.substring(db.indexOf(id)-1 , db.length()), (""));
    }
 
    return str;
}


 
  
   
   
   
 

}