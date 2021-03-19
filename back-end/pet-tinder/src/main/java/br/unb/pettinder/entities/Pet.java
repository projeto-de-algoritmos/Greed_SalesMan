package br.unb.pettinder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet  implements Comparable<Pet>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String race;
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "parent_weight")
    private Integer parentWeight;

    public Long getId() {
        return id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public int compareTo(Pet pet) {
        return (int) this.id.compareTo(pet.getId()) ;
    }

    public Integer getParentWeight() {
        return parentWeight;
    }

    public void setParentWeight(Integer parentWeight) {
        this.parentWeight = parentWeight;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + "]";
    }
    
    
    
}
