package hib_one_to_one.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private   int id;
    @Column(name = "name")
    private String name;
    @Column
    private String surname;
    @Column
    private String department;
    @Column
    private int salary;
    @OneToOne(cascade = CascadeType.ALL) // Если не прописать - по дефолту не раб. All - означат что при удалении удалятся и его связанные детали так и сохранение
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}
