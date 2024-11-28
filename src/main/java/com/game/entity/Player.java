package com.game.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "rpg", name = "player")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence", initialValue = 41, allocationSize = 1)
    @Column(nullable = false)
    Long id;

    @Column(length = 12, nullable = false)
    String name;

    @Column(length = 30, nullable = false)
    String title;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    Race race;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    Profession profession;

    @Column(nullable = false)
    Date birthday;

    @Column(nullable = false)
    Boolean banned;

    @Column(nullable = false)
    Integer level;
}