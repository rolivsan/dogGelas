package br.com.dog.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int frequency;
    private String characteristcs;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getFrequency(){
        return frequency;
    }

    public String getcharacter() {
        return characteristcs;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.name=name;
    }

    public void setFrequency(int frequency){
        this.frequency=frequency;
    }

    public void setCharacteristcs( String characteristcs){
        this.frequency=frequency;
    }


    //TODO arrumar os atributos conforme https://www.petlove.com.br/cane-corso/r

    //TODO implementar construtor com todos os atributos e um sem atributos

}
