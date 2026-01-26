package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO {

    // DB 접속 정보
    static final String URL = "jdbc:mysql://localhost:3306/javaDB";
    static final String USER = "javaUser";
    static final String PASSWORD = "1234";

    // 학생 추가
    public void insert(StudentDTO student) {

        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, student.name);
            pstmt.setInt(2, student.age);
            pstmt.setString(3, student.major);
            pstmt.setString(4, student.phone);

            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 전체 학생 조회
    public ArrayList<StudentDTO> selectAll() {

        ArrayList<StudentDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String major = rs.getString("major");
                String phone = rs.getString("phone");

                StudentDTO dto = new StudentDTO(name, age, major, phone);
                list.add(dto);
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // 이름으로 학생 조회
    public StudentDTO selectByName(String name) {

        String sql = "SELECT * FROM student WHERE name = ?";
        StudentDTO dto = null;

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                dto = new StudentDTO(
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("major"),
                        rs.getString("phone")
                );
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }
}

