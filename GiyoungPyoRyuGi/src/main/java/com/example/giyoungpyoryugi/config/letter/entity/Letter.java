package com.example.giyoungpyoryugi.config.letter.entity;

import com.example.giyoungpyoryugi.config.letter.dto.LetterCreateDTO;
import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long letterId;
    private String letterContents;
    private String letterTitle;
    private String letterDate;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    public static Letter toEntity(LetterCreateDTO letterCreateDTO) {
        return Letter.builder()
                .letterContents(letterCreateDTO.getLetterContents())
                .letterTitle(letterCreateDTO.getLetterTitle())
                .letterDate(letterCreateDTO.getLetterDate())
                .build();
    }
    public static Letter toEntity(String letterContents, String letterTitle, String letterDate) {
        return Letter.builder()
                .letterContents(letterContents)
                .letterTitle(letterTitle)
                .letterDate(letterDate)
                .user(null)
                .build();
    }
}
