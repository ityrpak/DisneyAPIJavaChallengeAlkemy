package com.alkemy.alkemyjavachallenge.disneydb.models;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Table (name = "disneycharacter")
public class DisneyCharacter {

    @Id
    @SequenceGenerator(
            name = "disneycharacter_sequence",
            sequenceName = "disneycharacter_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = SEQUENCE,
            generator = "disneycharacter_sequence"
    )
    private Long characterId;

    @Column(nullable = false, length = 1000)
    private String photoUrl;

    @Column(nullable = false, length = 100)
    private String name;

    @Column()
    private Integer age;

    @Column()
    private Integer weight;

    @Column(nullable = false, length = 1000)
    private String story;

    public DisneyCharacter() {
    }

    public DisneyCharacter(String name,
                           String photoUrl,
                           Integer age,
                           Integer weight,
                           String story) {
        this.photoUrl = photoUrl;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.story = story;
    }

    public Long getId() {
        return characterId;
    }

    public void setId(Long id) {
        this.characterId = id;
    }

    public String getphotoUrl() {
        return photoUrl;
    }

    public void setphotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
