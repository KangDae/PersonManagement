package person.view;


import person.model.Person_File;
import person.model.PersonDao;
import person.model.PersonVo;

public class insertView extends PersonView {
	
	@Override
	public PersonVo display() {
		
	System.out.println(":::::사람 정보::::");	
	
     PersonVo saram = new PersonVo();
     
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
