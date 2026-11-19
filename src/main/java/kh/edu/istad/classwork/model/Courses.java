package kh.edu.istad.classwork.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "m2_courses")
@Setter
@Getter
@NoArgsConstructor
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Integer id;

    @Column(nullable = false)
    private Integer count_rating;

    @Column(nullable = false)
    private LocalDateTime created_at;

    @Column(length = 255)
    private String description;

    @Column(nullable = false)
    private Float discount_percent;

    @Column(nullable = false)
    private Boolean is_deleted;

    @Column(nullable = false)
    private Boolean is_published;

    @Column(length = 255)
    private String keyword;

    @Column(length = 255)
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String slug;

    @Column(nullable = false)
    private Float star_rating;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    @Column(nullable = false)
    private Float total_hours;

    @Column(nullable = false)
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instruction_profiles instructor;
}
