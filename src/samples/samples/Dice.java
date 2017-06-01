package samples.samples;


public class Dice {
	
	private String SEP= " ";
	
	public enum AnyCrap {
		CRAP2(2), CRAP3(3), CRAP12(12);

		private final int total;

		private AnyCrap(int total) {
			this.total = total;
		}
	}
	
	
	public enum Field {
		FIELD2(2), FIELD3(3), FIELD4(4), FIELD9(9), FIELD10(10), FIELD11(11), FIELD12(12);

		private int total;

		private Field(int total) {
			this.total = total;
		}
	}
	
	public enum CrapName {
		
		SNAKEEYES(1,1) 
	   ,ACEDEUCE(1,2)
	   ,EASYFOUR(1,3)
	   ,FEWERFIVE(1,4)
       ,EASYSIX(1,5)	
	   ,SEVENOUT(1,6)	
       ,HARDFOUR(2,2)	
	   ,FIVE(2,3) //2,3
	   ,EASYSIX2(2,4) //2,4
	   ,SEVENOUT2(2,5)//2,5
	   ,EASYEIGHT(2,6)//2,6
	   ,HARDSIX(3,3)//3,3
	   ,SEVENOUT3(3,4)//3,4
	   ,EASYEIGHT2(3,5)//3,5
	   ,NINA(3,6)//3,6
	   ,HARDEIGHT(4,4)//4,4
	   ,NINA2(4,5)//4,5
	   ,EASYTEN(4,6)//4,6
	   ,HARDTEN(5,5)//5,5
	   ,YOELEVEN(5,6)//5,6
	   ,MIDNIGHT(6,6)//6,6
		;
		
		private int d1, d2;
		private CrapName(int d1, int d2 ) {
			this.d1=d1;	this.d2=d2;
		}
	}

	/*public String checkRoll(int o1, int o2) {
		if (o1 == o2) {
			return hardRoll(o1);
		} else if (o1==1 || o2==1){
			     if(o2==2 || o1==2){ return CrapName.ACEDEUCE.name();}
			else if(o2==3 || o1==3) { return CrapName.EASYFOUR.name();}
			else if(o2==4 || o1==4) { return CrapName.FEWERFIVE.name();}
			else if(o2==5 || o1==5) { return CrapName.EASYSIX.name();}
			else if(o2==6 || o1==6)  { return CrapName.SEVENOUT.name();} 
		} else if (o1==2 || o2==2){
		     if(o2==3 || o1==3){ return CrapName.FIVE.name();}
		else if(o2==4 || o1==4) { return CrapName.EASYSIX2.name();}
		else if(o2==5 || o1==5) { return CrapName.SEVENOUT2.name();}
		else if(o2==6 || o1==6) { return CrapName.EASYEIGHT.name();}
	   }else if(o1==3 || o2==3){
		     if(o2==4 || o1==4){ return CrapName.SEVENOUT3.name();}
		else if(o2==5 || o1==5) { return CrapName.EASYEIGHT2.name();}
		else if(o2==6 || o1==6) { return CrapName.NINA.name();}
	}else if(o1==4 || o2==4){
	     if(o2==5 || o1==5){ return CrapName.NINA2.name();}
	else if(o2==6 || o1==6) { return CrapName.EASYTEN.name();}
}else if(o1==5 || o2==5){
    if(o2==6 || o1==6){ return CrapName.YOELEVEN.name();}
}
		
		return "";
	}*/
	
	public String checkRoll(int d1,int d2) {
		if (d1== d2) 
			return hardRoll(d1);
		String sRetVal=SEP;
		switch(d1){
		  /* case 1: 
			if(d2==2) sRetVal = CrapName.ACEDEUCE.name();
			else if(d2==3) sRetVal = CrapName.EASYFOUR.name();
			else if(d2==4) sRetVal = CrapName.FEWERFIVE.name();
			else if(d2==5) sRetVal = CrapName.EASYSIX.name();
			else if(d2==6) sRetVal = CrapName.SEVENOUT.name();
			
		           break;*/
		
		 case 1: //here goes the d2 outcomes
			 switch (d2) {
				case 2: sRetVal = CrapName.ACEDEUCE.name();
					break;
				case 3: sRetVal = CrapName.EASYFOUR.name();
					break;
				case 4: sRetVal = CrapName.FEWERFIVE.name();
					break;
				case 5: sRetVal = CrapName.EASYSIX.name();
					break;
			default:sRetVal = CrapName.SEVENOUT.name();
				break;
			}
		           break;
		   case 2: //here goes the d2 outcomes
			   switch (d2) {
				case 1: sRetVal = CrapName.ACEDEUCE.name();
					break;
				case 3: sRetVal = CrapName.FIVE.name();
					break;
				case 4: sRetVal = CrapName.EASYSIX2.name();
					break;
				case 5: sRetVal = CrapName.SEVENOUT2.name();
					break;
			default:sRetVal = CrapName.EASYEIGHT2.name();
				break;
			}
			   break;
			   
		   case 3: 
			   switch (d2) {
				case 1: sRetVal = CrapName.EASYFOUR.name();
					break;
				case 2: sRetVal = CrapName.FIVE.name();
					break;
				case 4: sRetVal = CrapName.SEVENOUT3.name();
					break;
				case 5: sRetVal = CrapName.EASYEIGHT2.name();
					break;
				default:sRetVal = CrapName.NINA.name();
				break;
			}
			   break;

		   case 4: 
			   switch (d2) {
				case 1: sRetVal = CrapName.FEWERFIVE.name();
					break;
				case 2: sRetVal = CrapName.EASYSIX2.name();
					break;
				case 3: sRetVal = CrapName.SEVENOUT3.name();
					break;
				case 5: sRetVal = CrapName.NINA2.name();
					break;
				default:sRetVal = CrapName.EASYTEN.name();
				break;
			}
			   break;
			   
		   case 5: 
			   switch (d2) {
				case 1: sRetVal = CrapName.EASYSIX.name();
					break;
				case 2: sRetVal = CrapName.SEVENOUT2.name();
					break;
				case 3: sRetVal = CrapName.EASYEIGHT2.name();
					break;
				case 4: sRetVal = CrapName.NINA2.name();
					break;
				default:sRetVal = CrapName.YOELEVEN.name();
				break;
			}
			   break;
			   
		   case 6: 
			   switch (d2) {
				case 1: sRetVal = CrapName.SEVENOUT.name();
					break;
				case 2: sRetVal = CrapName.EASYEIGHT2.name();
					break;
				case 3: sRetVal = CrapName.NINA2.name();
					break;
				case 4: sRetVal = CrapName.EASYTEN.name();
					break;
				default:sRetVal = CrapName.YOELEVEN.name();
				break;
			}
			   break;
			   
		  default: //here goes the d2 outcomes
		}
		return sRetVal;
	}
		    
	
	public String hardRoll(int o1) {
		String sRetVal=SEP;
		
		switch (o1) {
		case 1: sRetVal=CrapName.SNAKEEYES.name();
			break;

		case 2:sRetVal=CrapName.HARDFOUR.name();
			break;

		case 3:sRetVal=CrapName.HARDSIX.name();
			break;

		case 4:sRetVal=CrapName.HARDEIGHT.name();
			break;
		
		case 5:sRetVal=CrapName.HARDTEN.name();
			break;

		default:sRetVal=CrapName.MIDNIGHT.name();
			break;
		}
		return sRetVal;
	}
	
	
	
	public String checkAnyCrap(int total) {
		String crapName=SEP;
		switch (total) {
		case 2:crapName=AnyCrap.CRAP2.name();
		break;
		case 3:crapName=AnyCrap.CRAP3.name();
		break;
		case 12:crapName=AnyCrap.CRAP12.name();
		break;
		}
		return crapName;
		
	}
	   
	public String checkField(int total) {
		String fieldName=SEP;
		switch (total) {
		case 3:fieldName=Field.FIELD3.name();
		break;
		case 4:fieldName=Field.FIELD4.name();
		break;
		case 9:fieldName=Field.FIELD9.name();
		break;
		case 10:fieldName=Field.FIELD10.name();
		break;
		case 11:fieldName=Field.FIELD11.name();
		break;
		case 12:Field.FIELD12.name();
		break;
		}
		return fieldName;
		
	}
	
	   public void casinoRoll(int noOfRoll) {
		   for (int i=0;i < noOfRoll;i++) {
			   
			   int dice1 = (int) (6.0 * Math.random()) +1;
			   int dice2 = (int) (6.0 * Math.random()) +1;
			 
			   int total = dice1+dice2;
			   if(total==7) 
				   System.out.println("----------SEVEN OUT-------"+ dice1 + "-"+ dice2);
			   else
			  System.out.println(dice1 + "-"+ dice2 + " Total= " + total +SEP+ getFinalRollName(dice1, dice2));
			   
			   
		   }
	   }
	   
	   
	   public String getFinalRollName(int dice1, int dice2) {
		   int total = dice1+dice2;
		 StringBuilder outcome =new StringBuilder(checkRoll(dice1, dice2));
		 	outcome.append(SEP).append(checkAnyCrap(total)).append(SEP).append(checkField(total));
		 return outcome.toString();
	   }
	   
	   public static void main(String[] args) {
		Dice d = new Dice();
		 d.casinoRoll(9);
	}
	}

