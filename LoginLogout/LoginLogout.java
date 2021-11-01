package LoginLogout;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class LoginLogout {
	public static void main(String[] args) throws IOException {
	      Scanner input = new Scanner(System.in);
	      ArrayList Ids = new ArrayList();
	      while(true) {
	         System.out.println("---------");
	         System.out.println("1. Sign Up");
	         System.out.println("2. Login");
	         System.out.println("3. Print All Users");
	         System.out.println("4. Save");
	         System.out.println("5. Exit");
	         System.out.println("---------");
	         System.out.println("옵션을 선택하십시오:");
	         int menu = input.nextInt();
	         if(menu == 5) {
	            break;
	         }
	         else {
	            switch(menu) {
	            case 1:
	               System.out.println("등록할 아이디를 입력하세요");
	               String id = input.next();
	               System.out.println("등록할 비밀번호를 입력하세요");
	               String password = input.next();
	               Member m = new Member(id,password);
	               Ids.add(m.getList()); // 회원 아이디 리스트를 더 큰 리스크로
	               break;
	            case 2:
	               System.out.println("아이디를 입력하십시오");
	               String testId = input.next();
	               System.out.println("비밀번호를 입력하십시오");
	               String testPa = input.next();
	               boolean login = false;
	               for(int i = 0; i<Ids.size(); i++) {
	                  ArrayList mem = (ArrayList) Ids.get(i); // 리스트 안에서 각 리스트 뽑기
	                  if(mem.get(0).equals(testId) && mem.get(1).equals(testPa)) { // 회원 정보 맞으면 부울린 true로
	                     login = true;
	                  }
	               }
	               if(login == true) {
	                  System.out.println("로그인이 되었습니다");
	               }
	               else {
	                  System.out.println("입력하신 아이디나 비밀번호를 다시 한번 확인해주십시오");
	               }
	               break;
	            case 3:
	               for(int i = 0; i<Ids.size(); i++) {
	                  ArrayList mem2 = (ArrayList) Ids.get(i); // 객체 arraylist로 형변환
	                  String a = (String) mem2.get(0); // 객체 string으로 형변환
	                  String b = (String) mem2.get(1);
	                  System.out.println("{"+a + ","+ b+"}");
	               }
	               break;
	            case 4:
	               FileWriter fWriter = new FileWriter("C:\\Users\\seonhan\\eclipse-workspace\\assignment\\src\\LoginLogout\\data.txt");
	               BufferedWriter out = new BufferedWriter(fWriter);
	               for(int i = 0; i<Ids.size(); i++){
	                  ArrayList mem2 = (ArrayList) Ids.get(i);
	                  String a = (String) mem2.get(0);
	                  String b = (String) mem2.get(1);
	                  out.write(a+","); out.write(b);
	                  out.newLine();
	               }
	               out.close();
	               fWriter.close();
	               System.out.println("저장이 완료되었습니다");
	               break;
	            default:
	               System.out.println("번호를 다시 입력해주십시오");
	               break;
	            }
	         }
	      }
	      input.close();
	   }

}
