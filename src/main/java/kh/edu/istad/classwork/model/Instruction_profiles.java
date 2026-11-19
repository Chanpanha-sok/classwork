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
@NoArgsConstructor
@Entity
@Table(name="m2_Instruction_profiles ")
public class Instruction_profiles {
    @Id
    @Column( nullable = false, length = 255)
    private String user_id;

    @Column(nullable = false, length = 255)
    private String biography;

    @Column(nullable = false, length = 255)
    private String facebook_link;

    @Column(nullable = false, length = 255)
    private String github_link;

    @Column(nullable = false, length = 255)
    private String job_title;

    @Column(nullable = false, length = 255)
    private String phone_number;
}
