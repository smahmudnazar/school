package com.example.maktabdarsliklari.entity;

import com.example.maktabdarsliklari.entity.enums.LanguageEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private LanguageEnum languageEnum;

    public Language(LanguageEnum languageEnum) {
        this.languageEnum = languageEnum;
    }
}
