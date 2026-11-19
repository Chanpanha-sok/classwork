package kh.edu.istad.classwork.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Table(name="m2_Coomments")
@Entity


public class Coomments {
    @Id
    private Integer id;
    @Column(nullable = false,length = 100)
    private String name;
    @Column(nullable = false)
    private  String text;
    @Column(nullable = false)
    private Integer parent_id;
    @Column(nullable = false)
    private Integer video_id;
}
