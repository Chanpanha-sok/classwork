package kh.edu.istad.classwork.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name="Categories")
public class Categories {
    @Id
    @Column()
    private Integer id;
    @Column(nullable = false)
    private Integer icon;
    @Column(nullable = false,length = 100)
    private String name;
    @Column(nullable = false)
    private Boolean is_delete;
}
