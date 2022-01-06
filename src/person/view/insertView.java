package person.view;


import person.model.Person_File;
import person.model.SaramDao;
import person.model.SaramVo;

public class insertView extends SaramView {
	
	@Override
	public SaramVo display() {
		
	System.out.println(":::::사람 정보::::");	
	
     SaramVo saram = new SaramVo();
     
     System.out.print("이름: ");
     saram.setName(scan.next()); 
     System.out.println();

     System.out.print("전화 번호: ");
     saram.setPhone(scan.next());
     System.out.println();

     System.out.print("email  : ");
     saram.setEmail(scan.next());

     System.out.println();

 
	System.out.println("입력완료");
	
	
	
	return saram;
	}

	

}
