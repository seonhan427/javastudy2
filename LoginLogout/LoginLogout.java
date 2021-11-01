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
	         System.out.println("�ɼ��� �����Ͻʽÿ�:");
	         int menu = input.nextInt();
	         if(menu == 5) {
	            break;
	         }
	         else {
	            switch(menu) {
	            case 1:
	               System.out.println("����� ���̵� �Է��ϼ���");
	               String id = input.next();
	               System.out.println("����� ��й�ȣ�� �Է��ϼ���");
	               String password = input.next();
	               Member m = new Member(id,password);
	               Ids.add(m.getList()); // ȸ�� ���̵� ����Ʈ�� �� ū ����ũ��
	               break;
	            case 2:
	               System.out.println("���̵� �Է��Ͻʽÿ�");
	               String testId = input.next();
	               System.out.println("��й�ȣ�� �Է��Ͻʽÿ�");
	               String testPa = input.next();
	               boolean login = false;
	               for(int i = 0; i<Ids.size(); i++) {
	                  ArrayList mem = (ArrayList) Ids.get(i); // ����Ʈ �ȿ��� �� ����Ʈ �̱�
	                  if(mem.get(0).equals(testId) && mem.get(1).equals(testPa)) { // ȸ�� ���� ������ �ο︰ true��
	                     login = true;
	                  }
	               }
	               if(login == true) {
	                  System.out.println("�α����� �Ǿ����ϴ�");
	               }
	               else {
	                  System.out.println("�Է��Ͻ� ���̵� ��й�ȣ�� �ٽ� �ѹ� Ȯ�����ֽʽÿ�");
	               }
	               break;
	            case 3:
	               for(int i = 0; i<Ids.size(); i++) {
	                  ArrayList mem2 = (ArrayList) Ids.get(i); // ��ü arraylist�� ����ȯ
	                  String a = (String) mem2.get(0); // ��ü string���� ����ȯ
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
	               System.out.println("������ �Ϸ�Ǿ����ϴ�");
	               break;
	            default:
	               System.out.println("��ȣ�� �ٽ� �Է����ֽʽÿ�");
	               break;
	            }
	         }
	      }
	      input.close();
	   }

}
