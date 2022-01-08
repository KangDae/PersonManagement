package person.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonDao {

	private List<PersonVo> InfoList = new ArrayList<PersonVo>();
	private int sequence = 0;
	public Scanner scan = new Scanner(System.in);

	public List<PersonVo> getInfoList() {
		return this.InfoList;
	}
	
	public void setInfoList(List<PersonVo> InfoList) {
		this.InfoList = InfoList;
	}
	
	
	 public void showperson() {	 	 
	        for(int i=0; i < this.InfoList.size(); i++) {
	            System.out.println("==========================");
	            System.out.println("번호 : " + this.InfoList.get(i).getNo());
	            System.out.println("이름 : " + this.InfoList.get(i).getName());
	            System.out.println("전화번호 : " + this.InfoList.get(i).getPhone());
	            System.out.println("email : " + this.InfoList.get(i).getEmail());
	            System.out.println("==========================");
	        }
	    }



	public void insert(PersonVo vo) {
        	vo.setNo(++this.sequence);
            this.InfoList.add(vo);
	}

	// ����
	public void update(PersonVo vo) {
		
		 
		  
		  
		  
		  System.out.print("수정을 적용 할 번호를 입력하시오>>");
		  int num = scan.nextInt();
	        
	       
	            
	            for(int i=0; i < this.InfoList.size(); i++) {

	                PersonVo temp = this.InfoList.get(i);

	                PersonVo tempPersonInfo = this.InfoList.get(i);

	 
	                if(num == temp.getNo()) {
	                	vo.setNo(num);
	 
	                   
	                    this.InfoList.remove(i);
	                    this.InfoList.add(i, vo);
	                    break;
	                }
	                
	                if(i == this.InfoList.size()-1) {
	                    System.out.println("오류");
	                }
	            }
	        
	        

	}

	public void delete() {
		
		 		 
		 System.out.println("삭제할 번호를 입력하시오");
		 int num = scan.nextInt();
	        
	    
	            for(int i=0; i < this.InfoList.size(); i++) {
	                PersonVo temp = this.InfoList.get(i);
	 
	                if(num == temp.getNo()) {
	                    this.InfoList.remove(i);
	                    break;
	                }
	                
	                if(i == this.InfoList.size()-1) {
	                    System.out.println("오류");
	                }
	            }
	        
	        
	       

	}

}
