package gongo.gongo.entity;

import javax.persistence.Entity;
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
    private int id;
     
    private String name;
    
    
    private String type;

}

