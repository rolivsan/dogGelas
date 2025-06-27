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
    private int energy;
    private int obedience;
    private int intelligence ;
    private int territolist;
    private int attachment;
    private int tendencytobark;
    private int friendship;
    private int friendshipAnimal;
    private String description;
    private int frequency;
    private String characteristcs;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getcharacter() {
        return characteristcs;
    }

    public int getEnergy() {
        return energy;
    }

    public int getObedience() {
        return obedience;
    }

    public int getIntelligence() {
        return intelligence ;
    }

    public int getTerritolist() {
        return territolist;
    }

    public int getAttachment() {
        return attachment;
    }

    public int getTendencytobark() {
        return tendencytobark;
    }

    public int getFriendship() {
        return friendship;
    }

    public int getFriendshipAnimal() {
        return friendshipAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.name = name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setCharacteristcs(String characteristcs) {
        this.frequency = frequency;
    }

    public void setEnergy(int energy){
        this.energy=energy;
    }

    public void setObedience(int obedience){
        this.obedience=obedience;
    }

    public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
    }

    public void setTerritolist(int territolist){
        this.territolist=territolist;
    }

    public void setAttachment(int attachment){
        this.attachment=attachment;
    }

    public void setTendencytobark(int tendencytobark){
        this.tendencytobark=tendencytobark;
    }

    public void setFriendship(int friendship){
        this.friendship=friendship;
    }

    public void setFriendshipAnimal(int friendshipAnimal){
        this.friendshipAnimal=friendshipAnimal;
    }


//        public dog(name, ,description, energy, intelligence, territolist, attachment, tendencytobark, friendship, friendshipAnimal){
//        this.name=name;
//          this.description=description;

//        }
//    Porque criar os cronstrutores? Sendo que á existe os ggetters and setters e meus atributos estão encapsulados

    //TODO arrumar os atributos conforme https://www.petlove.com.br/cane-corso/r

    //TODO implementar construtor com todos os atributos e um sem atributos

}
