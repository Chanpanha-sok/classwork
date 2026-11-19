package kh.edu.istad.classwork.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="m2-Student_Profies")
public class Student_Profies {
    @Id
    @Column( nullable = false, length = 255)
    private String user_id;

    @Column(length = 255)
    private String biography;

    @Column(nullable = false, length = 255)
    private String facebook_link;

    @Column(nullable = false, length = 255)
    private String github_link;

    @Column(length = 255)
    private String major;

    @Column(nullable = false, length = 255)
    private String phone_number;

    @Column(length = 255)
    private String university;
}
