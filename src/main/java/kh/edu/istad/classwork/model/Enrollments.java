package kh.edu.istad.classwork.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "m2_Enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime enrolled_at;

    @Column(nullable = false)
    private LocalDateTime payment_at;

    @Column(nullable = false, length = 255)
    private String payment_method;

    @Column(nullable = false)
    private Boolean payment_status;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student_Profies student;
}
