package gongo.gongo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder

@Entity
public class Category extends CommonEntity{
    
    @Id
    private int id; 

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private String name;

    private String type;

}

