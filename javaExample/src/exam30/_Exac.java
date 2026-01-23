package exam30;

import java.sql.*;
import java.util.Scanner;

public class _Exac {

    // JDBC 연결 정보
    static final String URL = "jdbc:mysql://localhost:3306/javaDB";
    static final String USER = "javaUser";
    static final String PASSWORD = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            while (true) {
                System.out.println("선택(0:종료, 1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제):");
                String menu = sc.nextLine();

                if (menu.equals("0")) {
                    System.out.println("프로그램 종료");
                    break;
                }

                // 1. 목록
                else if (menu.equals("1")) {
                    String sql = "SELECT hakbun, student_name FROM student";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    System.out.println("- 학생 목록 -");
                    while (rs.next()) {
                        int hakbun = rs.getInt("hakbun");
                        String name = rs.getString("student_name");
                        System.out.println(hakbun + ". " + name);
                    }
                    rs.close();
                    stmt.close();
                }

                // 2. 상세보기
                else if (menu.equals("2")) {
                    System.out.print("조회할 학번: ");
                    int hakbun = Integer.parseInt(sc.nextLine());

                    String sql = "SELECT * FROM student WHERE hakbun=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, hakbun);
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        System.out.println("학번: " + rs.getInt("hakbun"));
                        System.out.println("이름: " + rs.getString("student_name"));
                        System.out.println("주민번호: " + rs.getString("ssn"));
                        System.out.println("연락처: " + rs.getString("phone"));
                        System.out.println("주소: " + rs.getString("address"));
                        System.out.println("가입일: " + rs.getTimestamp("createdDate"));
                    } else {
                        System.out.println("해당 학번 없음");
                    }
                    rs.close();
                    pstmt.close();
                }

                // 3. 등록
                else if (menu.equals("3")) {
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("주민번호: ");
                    String ssn = sc.nextLine();
                    System.out.print("연락처: ");
                    String phone = sc.nextLine();
                    System.out.print("주소: ");
                    String address = sc.nextLine();

                    String sql = "INSERT INTO student (student_name, ssn, phone, address) VALUES (?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.setString(2, ssn);
                    pstmt.setString(3, phone);
                    pstmt.setString(4, address);
                    int result = pstmt.executeUpdate();

                    if (result > 0) {
                        System.out.println("등록 완료");
                    }
                    pstmt.close();
                }

                // 4. 수정
                else if (menu.equals("4")) {
                    System.out.print("수정할 학번: ");
                    int hakbun = Integer.parseInt(sc.nextLine());
                    System.out.print("새 연락처: ");
                    String phone = sc.nextLine();
                    System.out.print("새 주소: ");
                    String address = sc.nextLine();

                    String sql = "UPDATE student SET phone=?, address=? WHERE hakbun=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, phone);
                    pstmt.setString(2, address);
                    pstmt.setInt(3, hakbun);

                    int result = pstmt.executeUpdate();
                    if (result > 0) {
                        System.out.println("수정 완료");
                    } else {
                        System.out.println("해당 학번 없음");
                    }
                    pstmt.close();
                }

                // 5. 삭제
                else if (menu.equals("5")) {
                    System.out.print("삭제할 학번: ");
                    int hakbun = Integer.parseInt(sc.nextLine());

                    String sql = "DELETE FROM student WHERE hakbun=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, hakbun);

                    int result = pstmt.executeUpdate();
                    if (result > 0) {
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("해당 학번 없음");
                    }
                    pstmt.close();
                }

                else {
                    System.out.println("잘못된 메뉴 선택");
                }
            }

            conn.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
