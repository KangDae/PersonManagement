package person.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SaramDao {

	private List<SaramVo> InfoList = new ArrayList<SaramVo>();
	private int sequence = 0;
	public Scanner scan = new Scanner(System.in);

	public List<SaramVo> getInfoList() {
		return this.InfoList;
	}
	
	public void setInfoList(List<SaramVo> InfoList) {
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



	public void insert(SaramVo vo) {
        	vo.setNo(++this.sequence);
            this.InfoList.add(vo);
	}

	// ����
	public void update(SaramVo vo) {
		
		 
		  
		  
		  
		  System.out.print("수정을 적용 할 번호를 입력하시오>>");
		  int num = scan.nextInt();
	        
	       
	            
	            for(int idx=0; idx < this.InfoList.size(); idx++) {
	                SaramVo tempPersonInfo = this.InfoList.get(idx);
	 
	                if(num == tempPersonInfo.getNo()) {
	                	vo.setNo(num);
	 
	                   
	                    this.InfoList.remove(idx);
	                    this.InfoList.add(idx, vo);
	                    break;
	                }
	                
	                if(idx == this.InfoList.size()-1) {
	                    System.out.println("오류");
	                }
	            }
	        
	        

	}

	public void delete() {
		
		 		 
		 System.out.println("삭제할 번호를 입력하시오");
		 int num = scan.nextInt();
	        
	    
	            for(int idx=0; idx < this.InfoList.size(); idx++) {
	                SaramVo tempPersonInfo = this.InfoList.get(idx);
	 
	                if(num == tempPersonInfo.getNo()) {
	                    this.InfoList.remove(idx);
	                    break;
	                }
	                
	                if(idx == this.InfoList.size()-1) {
	                    System.out.println("오류");
	                }
	            }
	        
	        
	       

	}

}
