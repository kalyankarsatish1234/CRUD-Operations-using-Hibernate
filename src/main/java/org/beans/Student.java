package org.beans;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Student_Name")
    private String name;
    @Column(name = "Student_Standard")
    private int std;

    public Student(){}

    public Student(int id, String name, int std) {
        this.id = id;
        this.name = name;
        this.std = std;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", std=" + std +
                '}';
    }
}
