package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String name;
    
    private int id; 
    
    private String type;

}

